package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Boolean]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfBooleans private constructor(
    private val items: BooleanArray,
    private var position: Int
) : Iterator<Boolean> {

    constructor(vararg items: Boolean) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Boolean = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
