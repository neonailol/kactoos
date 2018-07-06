package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterator.EmptyIterator

class EmptyCollection<out E : Any> : Collection<E> {

    override val size: Int = 0

    override fun contains(element: @UnsafeVariance E): Boolean = false

    override fun containsAll(elements: Collection<@UnsafeVariance E>): Boolean = false

    override fun isEmpty(): Boolean = true

    override fun iterator(): Iterator<E> = EmptyIterator()
}
