package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * Head portion of the iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @param head Number of head elements.
 * @param origin Decorated iterator.
 * @since 0.4
 */
class HeadOf<out T>(
    private val head: Int,
    private val origin: Iterator<T>
) : Iterator<T> {

    /**
     * Current element index.
     */
    private var current: Int = 0

    override fun hasNext(): Boolean = current < head && origin.hasNext()

    override fun next(): T {
        if (isEmpty()) {
            throw NoSuchElementException(
                "The iterator doesn't have items any more"
            )
        }
        ++ current
        return origin.next()
    }
}
