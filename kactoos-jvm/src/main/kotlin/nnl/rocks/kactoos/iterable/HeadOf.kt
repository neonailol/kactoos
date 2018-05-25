package nnl.rocks.kactoos.iterable

/**
 * Head portion of the iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param num Number of head elements
 * @param iterable Decorated iterable
 * @since 0.5
 */
class HeadOf<T : Any>(
    num: Int,
    iterable: Iterable<T>
) : IterableEnvelope<T>({ Iterable { nnl.rocks.kactoos.iterator.HeadOf<T>(num, iterable.iterator()) } }) {

    constructor(num: Int, vararg src: T) : this(num, IterableOf<T>(*src))
}
