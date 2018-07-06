package nnl.rocks.kactoos.list

import kotlin.collections.ListIterator

class EmptyListIterator<out T : Any> : ListIterator<T> {

    override fun hasNext(): Boolean = false

    override fun hasPrevious(): Boolean = false

    override fun nextIndex(): Int = 0

    override fun previousIndex(): Int = - 1

    override fun next(): T = throw NoSuchElementException("This list iterator is always empty")

    override fun previous(): T = throw NoSuchElementException("This list iterator is always empty")
}
