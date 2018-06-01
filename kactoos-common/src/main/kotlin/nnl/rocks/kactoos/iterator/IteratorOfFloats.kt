package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Float]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfFloats private constructor(
    private val items: FloatArray,
    private var position: Int
) : Iterator<Float> {

    constructor(vararg items: Float) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Float = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
