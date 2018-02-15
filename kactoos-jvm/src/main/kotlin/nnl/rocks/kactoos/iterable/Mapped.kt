package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.text.TextOf

/**
 * Mapped iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @param fnc Func
 * @param src Source iterable
 * @since 0.1
 */
class Mapped<X : Any, Y : Any>(
    fnc: Func<X, Y>,
    iter: Iterable<X>
) : IterableEnvelope<Y>(Constant { Iterable { nnl.rocks.kactoos.iterator.Mapped(fnc, iter.iterator()) } }) {

    /**
     * Ctor.
     * @param fnc Func
     * @param src Source iterable
     */
    @SafeVarargs
    constructor(
        fnc: Func<X, Y>,
        vararg src: X
    ) : this(fnc, IterableOf<X>(*src))

    /**
     * Ctor.
     * @param fnc Func
     * @param src Source iterable
     */
    constructor(
        fnc: Func<X, Y>,
        iter: Iterator<X>
    ) : this(fnc, IterableOf<X>(iter))

    override fun toString(): String {
        return TextOf(this).toString()
    }
}
