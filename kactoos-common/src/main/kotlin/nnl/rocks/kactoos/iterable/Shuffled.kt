package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Shuffled

/**
 * Shuffled iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Shuffled<T : Any>(
    src: Iterable<T>
) : IterableEnvelope<T>({ IterableOf { Shuffled(src.iterator()) } }) {

    constructor(vararg src: T) : this(IterableOf { src.iterator() })

}
