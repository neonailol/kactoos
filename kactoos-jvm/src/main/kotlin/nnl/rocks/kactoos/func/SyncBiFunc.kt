package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc

/**
 * BiFunc that is thread-safe.
 *
 * Objects of this class are thread safe.
 *
 * @param X Type of first input
 * @param Y Type of second input
 * @param Z Type of output
 * @since 0.18
 */
class SyncBiFunc<in X : Any, in Y : Any, out Z : Any> constructor(
    private val func: BiFunc<X, Y, Z>,
    private val lock: Any
) : BiFunc<X, Y, Z> {

    constructor(func: BiFunc<X, Y, Z>) : this(func, func)

    override fun apply(
        first: X,
        second: Y
    ): Z = synchronized(this.lock) {
        return this.func.apply(first, second)
    }
}
