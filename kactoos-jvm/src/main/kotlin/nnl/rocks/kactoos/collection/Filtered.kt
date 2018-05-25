package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.text.TextOf

/**
 * Filtered collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item.
 * @since 1.16
 */
class Filtered<X : Any>(
    func: Func<X, Boolean>,
    src: Iterable<X>
) : CollectionEnvelope<X>({ CollectionOf<X>(Filtered<X>(func, src)) }) {

    /**
     * @param src Source collection
     * @param func Filter function
     * @since 0.23
     */
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

    override fun toString(): String = TextOf(this).toString()
}
