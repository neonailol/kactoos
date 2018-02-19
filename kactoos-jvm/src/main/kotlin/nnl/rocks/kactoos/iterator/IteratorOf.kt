package nnl.rocks.kactoos.iterator

import java.util.NoSuchElementException
import java.util.concurrent.atomic.AtomicInteger

/**
 * Iterator that returns the set of elements.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @param items Items to iterate
 * @since 0.3
 */
class IteratorOf<out X : Any>(
    private val list: Array<X>,
    private val position: AtomicInteger = AtomicInteger(0)
) : Iterator<X> {

    override fun hasNext(): Boolean = this.position.toInt() < this.list.size

    override fun next(): X = when {
        ! this.hasNext() -> throw NoSuchElementException(
            "The iterator doesn't have any more items"
        )
        else -> this.list[this.position.getAndIncrement()]
    }
}
