package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.TailOf

/**
 * Tail portion of the iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param num Number of tail elements
 * @param iterable Decorated iterable
 * @since 0.4
 */
class TailOf<T : Any>(
    num: Int,
    iterable: Iterable<T>
) : IterableEnvelope<T>({ IterableOf { TailOf(num, iterable.iterator()) } }) {

    constructor(num: Int, vararg args: T) : this(num, args.asIterable())
}
