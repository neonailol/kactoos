package nnl.rocks.kactoos.iterator

/**
 * Iterator that has no elements.
 *
 * @since 0.4
 */
class EmptyIterator<out T : Any> : Iterator<T> {

    override fun hasNext(): Boolean = false

    override fun next(): T = throw NoSuchElementException()
}
