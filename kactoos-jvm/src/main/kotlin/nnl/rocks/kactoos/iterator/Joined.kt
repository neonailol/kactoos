package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.empty
import nnl.rocks.kactoos.list.ListOf

/**
 * A few Iterators joined together.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.1
 */
class Joined<T : Any>(items: Iterable<Iterator<T>>) : Iterator<T> {

    private val iters: Iterator<Iterator<T>> = items.iterator()

    private var current: Iterator<T> = EmptyIterator()

    /**
     * @param items Items to concatenate
     */
    constructor(vararg items: Iterator<T>) : this(ListOf<Iterator<T>>(items.iterator()))

    override fun hasNext(): Boolean {
        while (current.empty() && iters.hasNext()) {
            current = iters.next()
        }
        return current.hasNext()
    }

    override fun next(): T {
        hasNext()
        return current.next()
    }
}
