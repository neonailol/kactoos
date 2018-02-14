package nnl.rocks.kactoos.iterator

import java.util.NoSuchElementException

/**
 * Cycled Iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.3
 */
class Cycled<out T>(private val origin: Iterable<T>) : Iterator<T> {

    /**
     * Iterator.
     */
    private var iterator: Iterator<T>? = null

    override fun hasNext(): Boolean {
        if (this.iterator == null || ! this.iterator !!.hasNext()) {
            this.iterator = this.origin.iterator()
        }
        return this.iterator !!.hasNext()
    }

    override fun next(): T {
        if (! this.hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return this.iterator !!.next()
    }
}
