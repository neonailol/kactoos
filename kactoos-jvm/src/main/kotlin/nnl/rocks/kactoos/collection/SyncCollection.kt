package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.SyncScalar

/**
 * Iterable as [Collection].
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Iterable] on each
 * method call. It doesn't cache the data anyhow. If you don't
 * need this [Collection] to re-fresh
 * its content on every call, by doing round-trips to
 * the encapsulated iterable, use [StickyCollection].
 *
 * Objects of this class are thread-safe.
 *
 * @param T List type
 * @see StickyCollection
 *
 * @since 0.24
 */
class SyncCollection<T : Any> : CollectionEnvelope<T> {

    constructor(src: Collection<T>) : super(SyncScalar<Collection<T>>({ src.toList() }))

    constructor(vararg array: T) : this(IterableOf<T>(array.asIterable()))

    constructor(src: Iterable<T>) : this(CollectionOf<T>(src))
}
