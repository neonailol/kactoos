package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Skipped

/**
 * Skipped collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of source item
 * @param skip How many to skip
 * @param src Source collection
 * @since 0.4
 */
class Skipped<T : Any>(
    skip: Int,
    src: Collection<T>
) : CollectionEnvelope<T>((CollectionOf(Skipped(skip, src)))) {

    constructor(
        skip: Int,
        vararg src: T
    ) : this(skip, IterableOf(src.asIterable()))

    constructor(
        skip: Int,
        src: Iterable<T>
    ) : this(skip, CollectionOf(src))
}
