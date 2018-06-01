package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Short]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfShorts private constructor(
    private val items: ShortArray,
    private var position: Int
) : Iterator<Short> {

    constructor(vararg items: Short) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Short = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
