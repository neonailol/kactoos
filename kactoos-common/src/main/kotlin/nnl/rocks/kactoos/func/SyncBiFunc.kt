package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.KBiFunc

/**
 * BiFunc that is thread-safe.
 *
 * Objects of this class are thread safe.
 *
 * @param X Type of first input
 * @param Y Type of second input
 * @param Z Type of output
 * @since 0.4
 */
class SyncBiFunc<in X : Any, in Y : Any, out Z : Any>(
    private val func: KBiFunc<X, Y, Z>,
    private val lock: Any
) : BiFunc<X, Y, Z> {

    constructor(func: KBiFunc<X, Y, Z>) : this(func, func)

    constructor(func: BiFunc<X, Y, Z>) : this({ x: X, y: Y -> func.apply(x, y) }, func)

    constructor(func: BiFunc<X, Y, Z>, lock: Any) : this({ x: X, y: Y -> func.apply(x, y) }, lock)

    override fun apply(first: X, second: Y): Z = synchronized(lock) { func(first, second) }
}
