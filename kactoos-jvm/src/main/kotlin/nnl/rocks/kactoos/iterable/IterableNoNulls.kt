package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.IteratorNoNulls

/**
 * A decorator for [Iterable] that doesn't allow any NULL.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.4
 */
class IterableNoNulls<out X : Any>(private val origin: Iterable<X>) : Iterable<X> {

    constructor(iterable: IterableEnvelope<X>) : this(iterable.toList())

    override fun iterator(): Iterator<X> = IteratorNoNulls(origin.iterator())
}
