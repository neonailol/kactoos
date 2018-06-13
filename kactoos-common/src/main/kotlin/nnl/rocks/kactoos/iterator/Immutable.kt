package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * Iterator that doesn't allow removal of elements.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type.
 * @param iterator Encapsulated iterator.
 * @since 0.4
 */
class Immutable<out T : Any>(private val iterator: Iterator<T>) : Iterator<T> by iterator {

    override fun next(): T = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> iterator.next()
    }
}
