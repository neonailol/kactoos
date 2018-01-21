package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.list.ListOf

import java.util.Collections

/**
 * A few Iterators joined together.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Type of item
 * @since 0.1
 */
class Joined<T>(items: Iterable<Iterator<T>>) : Iterator<T> {

    private val iters: Iterator<Iterator<T>> = items.iterator()

    private var current: Iterator<T> = Collections.emptyIterator()

    /**
     * @param items Items to concatenate
     */
    @SafeVarargs
    constructor(vararg items: Iterator<T>) : this(ListOf<Iterator<T>>(items.iterator()))

    override fun hasNext(): Boolean {
        while (! this.current.hasNext() && this.iters.hasNext()) {
            this.current = this.iters.next()
        }
        return this.current.hasNext()
    }

    override fun next(): T {
        return this.current.next()
    }
}
