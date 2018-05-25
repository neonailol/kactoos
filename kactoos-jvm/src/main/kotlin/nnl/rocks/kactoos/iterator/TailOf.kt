package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.collection.CollectionOf
import java.util.LinkedList

/**
 * Tail portion of the iterator.
 *
 * There is no thread-safety guarantee.
 * @param T Element type
 * @param iterator Decorated iterator
 * @param num Number of tail elements
 * @since 0.5
 */
class TailOf<T : Any>(num: Int, iterator: Iterator<T>) : Iterator<T> {

    private val origin: Iterator<T> = LinkedList(
        CollectionOf<T>(
            HeadOf(
                num,
                LinkedList(
                    CollectionOf(iterator)
                ).descendingIterator()
            )
        )
    ).descendingIterator()

    override fun hasNext(): Boolean = origin.hasNext()

    override fun next(): T = origin.next()
}
