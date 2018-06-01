package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Int]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfInts private constructor(
    private val items: IntArray,
    private var position: Int
) : Iterator<Int> {

    constructor(vararg items: Int) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Int = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}

