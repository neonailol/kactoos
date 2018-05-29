package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.empty

/**
 * Skipped iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Skipped<out T : Any>(
    private var omit: Int,
    private val origin: Iterator<T>
) : Iterator<T> {

    override fun hasNext(): Boolean {
        while (omit > 0 && origin.hasNext()) {
            origin.next()
            -- omit
        }
        return origin.hasNext()
    }

    override fun next(): T {
        if (empty()) {
            throw NoSuchElementException(
                "The iterator doesn't have items any more"
            )
        }
        return origin.next()
    }
}
