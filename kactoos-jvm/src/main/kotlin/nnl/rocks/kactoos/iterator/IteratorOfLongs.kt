package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * [Iterator] that returns the `long`s as [Long]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfLongs(
    private val items: LongArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Long> {

    constructor(vararg items: Long) : this(items)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Long {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}
