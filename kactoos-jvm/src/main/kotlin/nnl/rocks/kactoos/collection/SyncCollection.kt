package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.SyncScalar
import java.util.Collections
import java.util.LinkedList

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

    constructor(src: Collection<T>) : super(
        SyncScalar<Collection<T>>(
            Constant {
                val temp = LinkedList<T>()
                temp.addAll(src)
                Collections.synchronizedCollection<T>(temp)
            }
        )
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
     * @param src An [Iterable]
     */
    constructor(src: Iterable<T>) : this(CollectionOf<T>(src))
}
