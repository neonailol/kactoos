package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Skipped

/**
 * Skipped iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Skipped<out T : Any>(
    skip: Int,
    iterable: Iterable<T>
) : IterableEnvelope<T>({ IterableOf { Skipped(skip, iterable.iterator()) } }) {

    constructor(
        skip: Int,
        vararg src: T
    ) : this(skip, src.asIterable())
}
