package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KBiFunc

/**
 * Func that caches previously calculated values and doesn't
 * recalculate again.
 *
 * This [Func] decorator technically is an in-memory
 * cache.
 *
 * Pay attention that this class is not thread-safe. It is highly
 * recommended to always decorate it with [SyncFunc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of output
 * @see StickyScalar
 *
 * @since 0.1
 */
class StickyFunc<in X : Any, out Y : Any>(
    private val func: KBiFunc<X, Boolean, Y>
) : Func<X, Y> {

    constructor(func: BiFunc<X, Boolean, Y>) : this({ first, second -> func.apply(first, second) })

    constructor(
        fnc: Func<X, Y>,
        max: Int
    ) : this(StickyBiFunc(BiFuncOf({ first, _ -> fnc.apply(first) }), max))

    constructor(fnc: Func<X, Y>) : this(
        StickyBiFunc(
            BiFuncOf({ first, _ -> fnc.apply(first) })
        )
    )

    override fun apply(input: X): Y = func(input, true)
}
