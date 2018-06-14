package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.internal.isEmpty

/**
 * Cycled Iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.3
 */
class Cycled<out T : Any>(private val origin: KScalar<Iterable<T>>) : Iterator<T> {

    constructor(iterable: Iterable<T>) : this({ iterable })

    private var iterator: Iterator<T> = EmptyIterator()

    override fun hasNext(): Boolean {
        if (this.iterator.isEmpty()) {
            this.iterator = origin().iterator()
        }
        return this.iterator.hasNext()
    }

    override fun next(): T {
        return when {
            isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
            else -> this.iterator.next()
        }
    }
}
