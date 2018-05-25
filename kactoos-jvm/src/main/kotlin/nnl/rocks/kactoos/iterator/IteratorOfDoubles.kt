package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * Iterator that returns a set of double values.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfDoubles(
    private val items: DoubleArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Double> {

    constructor(vararg items: Double) : this(items)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Double {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}
