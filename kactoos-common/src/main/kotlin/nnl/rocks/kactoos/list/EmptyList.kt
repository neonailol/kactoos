package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterator.EmptyIterator
import kotlin.collections.ListIterator

class EmptyList<out E : Any> : List<E> {

    override val size: Int = 0

    override fun contains(element: @UnsafeVariance E): Boolean = false

    override fun containsAll(elements: Collection<@UnsafeVariance E>): Boolean = false

    override fun get(index: Int): E = throw NoSuchElementException("This list is always empty")

    override fun indexOf(element: @UnsafeVariance E): Int = -1

    override fun isEmpty(): Boolean = true

    override fun iterator(): Iterator<E> = EmptyIterator()

    override fun lastIndexOf(element: @UnsafeVariance E): Int = -1

    override fun listIterator(): ListIterator<@UnsafeVariance E> = EmptyListIterator()

    override fun listIterator(index: Int): ListIterator<@UnsafeVariance E> = EmptyListIterator()

    override fun subList(fromIndex: Int, toIndex: Int): List<E> = EmptyList()
}
