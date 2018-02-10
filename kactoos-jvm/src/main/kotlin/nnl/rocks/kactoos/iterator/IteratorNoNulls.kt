package nnl.rocks.kactoos.iterator

import java.util.concurrent.atomic.AtomicLong

/**
 * A decorator of an [Iterator] that returns no NULL.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item.
 * @param iterator Encapsulated iterator.
 * @param pos Position counter.
 * @since 0.3
 */
class IteratorNoNulls<out X : Any>(
    private val iterator: MutableIterator<X>,
    private val pos: AtomicLong
) : MutableIterator<X> by iterator {

    constructor(iterator: Iterator<X>) : this(
        {
            val mutableList = mutableListOf<X>()
            iterator.forEach { mutableList.add(it) }
            mutableList.iterator()
        }.invoke(),
        AtomicLong()
    )

    override fun next(): X = with(pos.incrementAndGet()) {
        return iterator.next()
    }
}
