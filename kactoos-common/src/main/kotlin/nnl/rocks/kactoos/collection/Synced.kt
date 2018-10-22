package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.SyncScalar

/**
 * Iterable as [Collection].
 *
 * Objects of this class are thread-safe.
 *
 * @param T List type
 * @see Sticky
 * @since 0.4
 */
class Synced<out T : Any> : CollectionEnvelope<T> {

    constructor(source: Collection<T>) : super(SyncScalar<Collection<T>> { source })

    constructor(vararg args: T) : this(IterableOf(args.asIterable()))

    constructor(iterable: Iterable<T>) : this(CollectionOf(iterable))

}
