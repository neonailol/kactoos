package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.EmptyIterator

/**
 * Iterable that returns [EmptyIterator]
 *
 * @param T
 */
class EmptyIterable<out T : Any> : Iterable<T> {

    override fun iterator(): Iterator<T> = EmptyIterator()
}
