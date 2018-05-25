package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * [Iterator] that returns the `char`s as [Character]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfChars(
    private val items: CharArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Char> {

    constructor(vararg items: Char) : this(items)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Char {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}
