package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Shuffled
import nnl.rocks.kactoos.scalar.Constant

/**
 * Shuffled iterable.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.20
 */
class Shuffled<T : Any>(src: Iterable<T>) : IterableEnvelope<T>(
    Constant { Iterable { Shuffled<T>(src.iterator()) } }
) {

    /**
     * @param src The underlying iterable
     * @since 0.23
     */
    @SafeVarargs
    constructor(vararg src: T) : this(IterableOf<T>(src.iterator()))

    /**
     * @param src The underlying iterable
     * @since 0.23
     */
    constructor(src: Iterator<T>) : this(IterableOf<T>(src))
}
