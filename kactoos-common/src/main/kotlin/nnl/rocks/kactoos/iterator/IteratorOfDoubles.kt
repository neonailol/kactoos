package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.internal.isEmpty

/**
 * [Iterator] over [Double]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class IteratorOfDoubles private constructor(
    private val items: DoubleArray,
    private var position: Int
) : Iterator<Double> {

    constructor(vararg items: Double) : this(items, 0)

    override fun hasNext(): Boolean = position < items.size

    override fun next(): Double = when {
        isEmpty() -> throw NoSuchElementException("The iterator doesn't have any more items")
        else -> items[position ++]
    }
}
