package nnl.rocks.kactoos.iterator

import java.util.NoSuchElementException

/**
 * Skipped iterator.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.8
 */
class Skipped<out T>(
    private var omit: Int,
    private val origin: Iterator<T>
) : Iterator<T> {

    override fun hasNext(): Boolean {
        while (this.omit > 0 && this.origin.hasNext()) {
            this.origin.next()
            -- this.omit
        }
        return this.origin.hasNext()
    }

    override fun next(): T {
        if (! this.hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have items any more"
            )
        }
        return this.origin.next()
    }
}
