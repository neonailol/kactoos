package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KBiFunc

/**
 * Func that caches previously calculated values and doesn't recalculate again.
 *
 * This [Func] decorator technically is an in-memory cache.
 *
 * There is no thread-safety guarantee. It is highly recommended to decorate it with [SyncFunc]
 *
 * @param X Type of input
 * @param Y Type of output
 * @see nnl.rocks.kactoos.scalar.StickyScalar
 *
 * @since 0.1
 */
class StickyFunc<in X : Any, out Y : Any>(
    private val func: KBiFunc<X, Boolean, Y>
) : Func<X, Y> {

    constructor(
        func: BiFunc<X, Boolean, Y>
    ) : this(
        { first, second -> func.apply(first, second) }
    )

    constructor(
        fnc: Func<X, Y>,
        max: Int
    ) : this(
        StickyBiFunc({ first, _ -> fnc.apply(first) }, max)
    )

    constructor(
        fnc: Func<X, Y>
    ) : this(
        StickyBiFunc { first, _ -> fnc.apply(first) }
    )

    override fun apply(input: X): Y = func(input, true)
}
