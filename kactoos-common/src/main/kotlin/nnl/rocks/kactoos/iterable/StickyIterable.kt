package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Iterable that returns the same set of elements, always.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.1
 */
class StickyIterable<out X : Any>(
    iterable: Iterable<X>
) : IterableEnvelope<X>(StickyScalar<Iterable<X>>{ iterable.asIterable() }) {

    constructor(vararg src: X) : this(src.asIterable())
}
