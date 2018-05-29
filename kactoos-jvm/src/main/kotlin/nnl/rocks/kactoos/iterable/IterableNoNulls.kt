package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorNoNulls
import java.util.concurrent.atomic.AtomicLong

/**
 * A decorator for [Iterable] that doesn't allow any NULL.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.4
 */
class IterableNoNulls<out X : Any>(private val origin: MutableIterable<X>) : MutableIterable<X> {

    constructor(iterable: IterableEnvelope<X>) : this(iterable.toMutableList())

    override fun iterator(): MutableIterator<X> = IteratorNoNulls(origin.iterator(), AtomicLong())
}
