package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func

/**
 * Func that is thread-safe and sticky.
 *
 * Objects of this class are thread safe.
 *
 * @param X Type of input
 * @param Y Type of output
 * @since 0.24
 */
class SolidFunc<in X : Any, out Y : Any>(
    private val func: SyncFunc<X, Y>
) : Func<X, Y> {

    constructor(
        fnc: Func<X, Y>,
        max: Int
    ) : this(SyncFunc(StickyFunc(fnc, max)))

    constructor(
        fnc: Func<X, Y>
    ) : this(SyncFunc(StickyFunc(fnc, Integer.MAX_VALUE)))

    override fun apply(input: X): Y = this.func.apply(input)
}
