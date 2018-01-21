package nnl.rocks.kactoos.iterator

import java.util.NoSuchElementException

/**
 * Limited origin.
 *
 * This is a decorator over an existing origin. Returns elements of the
 * original origin, until either the requested number of items have been
 * returned or the underlying origin has been exhausted.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.6
 */
class Limited<out T>(
    private val restrict: Int,
    private val origin: Iterator<T>
) : Iterator<T> {

    /**
     * Number of elements returned so far.
     */
    private var consumed: Int = 0

    override fun hasNext(): Boolean {
        return this.consumed < this.restrict && this.origin.hasNext()
    }

    override fun next(): T {
        if (! this.hasNext()) {
            throw NoSuchElementException("No more elements.")
        }
        ++ this.consumed
        return this.origin.next()
    }
}
