package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * [Iterator] that returns the `boolean`s as [Boolean]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfBooleans(
    private val list: BooleanArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Boolean> {

    constructor(vararg items: Boolean) : this(items)

    override fun hasNext(): Boolean = position.toInt() < list.size

    override fun next(): Boolean {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return list[position.getAndIncrement()]
    }
}
