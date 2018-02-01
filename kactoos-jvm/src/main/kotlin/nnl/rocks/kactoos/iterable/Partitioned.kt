package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Iterable implementation for partitioning functionality.
 *
 * @param T Partitions value type
 * @since 0.29
 */
class Partitioned<T : Any> : IterableEnvelope<List<T>> {

    /**
     * @param size The partitions size.
     * @param iterable The source [Iterable].
     */
    constructor(
        size: Int,
        iterable: Iterable<T>
    ) : super(ScalarOf {
        Iterable {
            nnl.rocks.kactoos.iterator.Partitioned<T>(
                size, iterable.iterator()
            )
        }
    })

    /**
     * Ctor.
     * @param size The partitions size.
     * @param items The source items.
     */
    @SafeVarargs
    constructor(
        size: Int,
        vararg items: T
    ) : this(size, IterableOf<T>(items.iterator()))
}
