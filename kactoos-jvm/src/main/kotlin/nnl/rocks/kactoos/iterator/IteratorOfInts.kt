package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * [Iterator] that returns the `int`s as [Integer]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfInts(
    private val items: IntArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Int> {

    constructor(vararg items: Int) : this(items)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Int {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}

