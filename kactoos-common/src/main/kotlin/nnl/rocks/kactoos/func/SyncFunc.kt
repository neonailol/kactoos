package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.Proc

/**
 * Func that is thread-safe.
 *
 * Objects of this class are thread safe.
 *
 * @param X Type of input
 * @param Y Type of output
 * @since 0.4
 */
class SyncFunc<X : Any, Y : Any>(
    private val func: KFunc<X, Y>,
    private val lock: Any
) : Func<X, Y> {

    constructor(func: KFunc<X, Y>) : this(func, func)

    constructor(func: Func<X, Y>) : this({ x: X -> func.apply(x) }, func)

    constructor(func: Func<X, Y>, lock: Any) : this({ x: X -> func.apply(x) }, lock)

    constructor(
        proc: Proc<X>,
        result: Y
    ) : this(
        FuncOf { input ->
            proc.exec(input)
            result
        }
    )

    override fun apply(input: X): Y = synchronized(lock) {
        func(input)
    }
}
