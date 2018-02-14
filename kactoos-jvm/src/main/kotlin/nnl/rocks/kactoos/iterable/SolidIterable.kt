package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * An [Iterable] that is both synchronized and sticky.
 *
 * Objects of this class are thread-safe.
 *
 *
 *
 * @param X Type of item
 * @since 0.24
 */
class SolidIterable<X : Any>(iterable: Iterable<X>) : IterableEnvelope<X>(
    SolidScalar<Iterable<X>>(
        Constant { SyncIterable<X>(StickyIterable<X>(iterable)) }
    )
) {

    /**
     * Ctor.
     * @param src The underlying iterable
     */
    @SafeVarargs
    constructor(vararg src: X) : this(IterableOf<X>(src.iterator()))
}
