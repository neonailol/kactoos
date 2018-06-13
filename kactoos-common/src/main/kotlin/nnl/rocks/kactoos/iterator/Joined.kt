package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * A few Iterators joined together.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.1
 */
class Joined<out T : Any> private constructor(
    private val iterators: Iterator<Iterator<T>>,
    private var current: Iterator<T>
) : Iterator<T> {

    constructor(items: Iterable<Iterator<T>>) : this(items.iterator(), EmptyIterator())

    constructor(vararg items: Iterator<T>) : this(items.iterator(), EmptyIterator())

    override fun hasNext(): Boolean {
        while (current.isEmpty() && iterators.hasNext()) {
            current = Immutable(iterators.next())
        }
        return current.hasNext()
    }

    override fun next(): T = current.next()
}
