package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * [Iterator] that returns the `short`s as [Short]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfShorts(
    private val items: ShortArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Short> {

    constructor(vararg items: Short) : this(items)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Short {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}
