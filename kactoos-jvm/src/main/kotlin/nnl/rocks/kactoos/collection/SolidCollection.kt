package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * A [Collection] that is both synchronized and sticky.
 *
 * Objects of this class are thread-safe.
 *
 * @param T List type
 * @see StickyCollection
 * @since 0.24
 */
class SolidCollection<T : Any> : CollectionEnvelope<T> {

    constructor(src: Collection<T>) : super(
        SolidScalar<Collection<T>>(ScalarOf { SyncCollection<T>(StickyCollection<T>(src)) })
    )

    /**
     * @param array An array of some elements
     */
    @SafeVarargs
    constructor(vararg array: T) : this(IterableOf<T>(array.iterator()))

    /**
     * @param src An [Iterator]
     */
    constructor(src: Iterator<T>) : this(IterableOf<T>(src))

    /**
     * @param src An [Iterator]
     */
    constructor(src: Iterable<T>) : this(CollectionOf<T>(src))
}
