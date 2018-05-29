package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.scalar.Not

/**
 * Iterator that returns the set of elements.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @param items Items to iterate
 * @since 0.3
 */
class IteratorOf<out X : Any> private constructor(
    private val items: Array<out X>,
    private var position: Int
) : Iterator<X> {

    constructor(vararg items: X) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): X = when {
        Not(hasNext()).invoke() -> throw NoSuchElementException(
            "The iterator doesn't have any more items"
        )
        else -> items[position ++]
    }
}
