package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.IterableOf

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
        { CollectionOf<X>(Filtered<X>(func, src)) }
    )

    constructor(
        func: Func<X, Boolean>,
        src: Iterable<X>
    ) : super(
        { CollectionOf<X>(Filtered<X>(func, src)) }
    )

    /**
     * @param src Source collection
     * @param func Filter function
     * @since 0.23
     */
    @SafeVarargs
    constructor(
        func: Func<X, Boolean>,
        vararg src: X
    ) : this(func, IterableOf<X>(src.iterator()))

    /**
     * Ctor.
     * @param src Source collection
     * @param func Filter function
     * @since 0.23
     */
    constructor(
        func: Func<X, Boolean>,
        src: Iterator<X>
    ) : this(func, IterableOf<X>(src))
}
