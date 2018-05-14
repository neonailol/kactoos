package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Skipped
import nnl.rocks.kactoos.scalar.Constant

/**
 * Skipped collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of source item
 * @param skip How many to skip
 * @param src Source collection
 * @since 0.29
 */
class Skipped<T : Any>(
    skip: Int,
    src: Collection<T>
) : CollectionEnvelope<T>(
    Constant<Collection<T>>(CollectionOf<T>(Skipped<T>(skip, src)))
) {

    /**
     * Ctor.
     * @param skip How many to skip
     * @param src Source elements
     */
    @SafeVarargs
    constructor(
        skip: Int,
        vararg src: T
    ) : this(skip, IterableOf<T>(*src))

    /**
     * Ctor.
     * @param skip How many to skip
     * @param src Source iterable
     */
    constructor(
        skip: Int,
        src: Iterable<T>
    ) : this(skip, CollectionOf<T>(src))
}
