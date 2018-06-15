package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Partitioned

/**
 * Iterable implementation for partitioning functionality.
 *
 * @param T Partitions value type
 * @since 0.4
 */
class Partitioned<T : Any> : IterableEnvelope<List<T>> {

    constructor(
        size: Int,
        iterable: Iterable<T>
    ) : super({ IterableOf { Partitioned(size, iterable.iterator()) } })

    constructor(
        size: Int,
        vararg items: T
    ) : this(size, items.asIterable())
}
