package nnl.rocks.kactoos.iterable

/**
 * Tail portion of the iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param num Number of tail elements
 * @param iterable Decorated iterable
 * @since 0.5
 */
class TailOf<T : Any>(
    num: Int,
    iterable: Iterable<T>
) : IterableEnvelope<T>({ Iterable { nnl.rocks.kactoos.iterator.TailOf<T>(num, iterable.iterator()) } }) {

    constructor(num: Int, vararg src: T) : this(num, IterableOf<T>(*src))
}
