package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * An [Iterable] that is both synchronized and sticky.
 *
 * Objects of this class are thread-safe.
 *
 * @param X Type of item
 * @since 0.4
 */
class SolidIterable<X : Any>(
    iterable: Iterable<X>
) : IterableEnvelope<X>(SolidScalar<Iterable<X>> { SyncIterable(StickyIterable(iterable)) }) {

    constructor(vararg src: X) : this(src.asIterable())
}
