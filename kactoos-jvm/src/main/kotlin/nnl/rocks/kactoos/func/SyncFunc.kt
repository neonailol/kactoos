package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import java.util.concurrent.Callable

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
    private val func: Func<X, Y>,
    private val lock: Any
) : Func<X, Y> {

    constructor(func: Func<X, Y>) : this(func, func)

    constructor(proc: Proc<X>) : this(FuncOf(proc))

    constructor(runnable: Runnable) : this(FuncOf(runnable))

    /**
     * @param runnable Func original
     * @since 0.12
     */
    constructor(
        runnable: Runnable,
        result: Y
    ) : this(
        FuncOf { input ->
            runnable.run()
            result
        }
    )

    /**
     * @param callable Func original
     * @since 0.12
     */
    constructor(callable: Callable<Y>) : this(FuncOf<X, Y>(callable))

    /**
     * @param proc Func original
     * @since 0.12
     */
    constructor(
        proc: Proc<X>,
        result: Y
    ) : this(
        FuncOf { input ->
            proc.exec(input)
            result
        }
    )

    @Throws(Exception::class)
    override fun apply(input: X): Y {
        synchronized(this.lock) {
            return this.func.apply(input)
        }
    }
}
