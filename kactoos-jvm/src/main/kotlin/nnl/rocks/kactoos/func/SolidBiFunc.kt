package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc

/**
 * BiFunc that is thread-safe and sticky.
 *
 * Objects of this class are thread safe.
 *
 * @param X Type of first input
 * @param Y Type of second input
 * @param Z Type of output
 * @since 0.24
 */
class SolidBiFunc<in X : Any, in Y : Any, out Z : Any>(
    private val func: BiFunc<X, Y, Z>
) : BiFunc<X, Y, Z> {

    constructor(
        fnc: BiFunc<X, Y, Z>,
        max: Int
    ) : this(SyncBiFunc(StickyBiFunc(fnc, max)))

    override fun apply(
        first: X,
        second: Y
    ): Z {
        return this.func.apply(first, second)
    }
}
