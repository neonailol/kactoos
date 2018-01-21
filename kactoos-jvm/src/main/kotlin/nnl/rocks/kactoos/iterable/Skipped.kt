package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Skipped
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Skipped iterable.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.8
 */
class Skipped<T : Any>(
    skip: Int,
    iterable: Iterable<T>
) : IterableEnvelope<T>(
    ScalarOf {
        Iterable {
            Skipped<T>(
                skip, iterable.iterator()
            )
        }
    }
) {

    /**
     * Ctor.
     * @param skip How many to skip
     * @param src The underlying iterable
     */
    @SafeVarargs
    constructor(
        skip: Int,
        vararg src: T
    ) : this(skip, IterableOf<T>(src.iterator()))
}
