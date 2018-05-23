package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.text.TextOf

/**
 * Mapped collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @param Y Type of target item
 * @since 0.3
 */
class Mapped<X : Any, Y : Any>(
    fnc: Func<X, Y>,
    src: Collection<X>
) : CollectionEnvelope<Y>( { CollectionOf<Y>(nnl.rocks.kactoos.iterable.Mapped(fnc, src)) }) {

    /**
     * Ctor.
     * @param src Source collection
     * @param fnc Func
     * @since 0.23
     */
    @SafeVarargs
    constructor(
        fnc: Func<X, Y>,
        vararg src: X
    ) : this(fnc, IterableOf<X>(*src))

    /**
     * Ctor.
     * @param src Source collection
     * @param fnc Func
     * @since 0.23
     */
    constructor(
        fnc: Func<X, Y>,
        src: Iterator<X>
    ) : this(fnc, IterableOf<X>(src))

    /**
     * Ctor.
     * @param src Source collection
     * @param fnc Func
     */
    constructor(
        fnc: Func<X, Y>,
        src: Iterable<X>
    ) : this(fnc, CollectionOf<X>(src))

    override fun toString(): String = TextOf(this).toString()
}
