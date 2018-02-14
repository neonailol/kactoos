package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Limited
import nnl.rocks.kactoos.scalar.Constant

/**
 * Limited collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of source item
 * @since 1.16
 */
class Limited<X : Any> : CollectionEnvelope<X> {

    constructor(
        lmt: Int,
        src: Collection<X>
    ) : super(
        Constant { CollectionOf<X>(Limited<X>(lmt, src)) }
    )

    /**
     * @param src Source collection
     * @param lmt Requested number of elements
     * @since 0.23
     */
    @SafeVarargs
    constructor(
        lmt: Int,
        vararg src: X
    ) : this(lmt, IterableOf<X>(src.iterator()))

    /**
     * @param src Source collection
     * @param lmt Requested number of elements
     * @since 0.23
     */
    constructor(
        lmt: Int,
        src: Iterator<X>
    ) : this(lmt, IterableOf<X>(src))

    /**
     * @param src Source collection
     * @param lmt Requested number of elements
     */
    constructor(
        lmt: Int,
        src: Iterable<X>
    ) : this(lmt, CollectionOf<X>(src))
}
