package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Filtered collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item.
 * @since 0.3
 */
class Filtered<X : Any> : CollectionEnvelope<X> {

    constructor(
        func: KFunc<X, Boolean>,
        src: Iterable<X>
    ) : super(
        ScalarOf { CollectionOf<X>(nnl.rocks.kactoos.iterable.Filtered<X>(func, src)) }
    )

    /**
     * @param src Source collection
     * @param func Filter function
     * @since 0.23
     */
    @SafeVarargs
    constructor(
        func: KFunc<X, Boolean>,
        vararg src: X
    ) : this(func, IterableOf<X>(src.iterator()))

    /**
     * Ctor.
     * @param src Source collection
     * @param func Filter function
     * @since 0.23
     */
    constructor(
        func: KFunc<X, Boolean>,
        src: Iterator<X>
    ) : this(func, IterableOf<X>(src))
}
