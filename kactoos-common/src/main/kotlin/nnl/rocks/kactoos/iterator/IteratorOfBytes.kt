package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Byte]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfBytes private constructor(
    private val items: ByteArray,
    private var position: Int
) : Iterator<Byte> {

    constructor(vararg bytes: Byte) : this(bytes, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Byte = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
