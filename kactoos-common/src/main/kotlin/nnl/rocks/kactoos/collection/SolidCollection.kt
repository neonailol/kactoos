package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.SolidScalar

/**
 * A [Collection] that is both synchronized and sticky.
 *
 * Objects of this class are thread-safe.
 *
 * @param T List type
 * @see StickyCollection
 * @since 0.4
 */
class SolidCollection<T : Any> : CollectionEnvelope<T> {

    constructor(source: Collection<T>) : super(SolidScalar<Collection<T>> { SyncCollection(StickyCollection(source)) })

    constructor(vararg args: T) : this(IterableOf(args.asIterable()))

    constructor(iterable: Iterable<T>) : this(CollectionOf(iterable))
}
