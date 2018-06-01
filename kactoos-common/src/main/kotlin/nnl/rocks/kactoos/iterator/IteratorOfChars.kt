package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Char]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfChars private constructor(
    private val items: CharArray,
    private var position: Int
) : Iterator<Char> {

    constructor(vararg items: Char) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Char = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
