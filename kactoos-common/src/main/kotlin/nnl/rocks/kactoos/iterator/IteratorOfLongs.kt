package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Long]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfLongs private constructor(
    private val items: LongArray,
    private var position: Int
) : Iterator<Long> {

    constructor(vararg items: Long) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Long = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
