package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.HeadOf

/**
 * Head portion of the iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param num Number of head elements
 * @param iterable Decorated iterable
 * @since 0.4
 */
class HeadOf<out T : Any>(
    num: Int,
    iterable: Iterable<T>
) : IterableEnvelope<T>(IterableOf { HeadOf(num, iterable.iterator()) }) {

    constructor(num: Int, vararg src: T) : this(num, src.asIterable())
}
