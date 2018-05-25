package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicInteger

/**
 * [Iterator] that returns the `float`s as [Float]s.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class IteratorOfFloats(
    private val items: FloatArray,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<Float> {

    constructor(vararg items: Float) : this(items)

    override fun hasNext(): Boolean = position.toInt() < items.size

    override fun next(): Float {
        if (! hasNext()) {
            throw NoSuchElementException(
                "The iterator doesn't have any more items"
            )
        }
        return items[position.getAndIncrement()]
    }
}
