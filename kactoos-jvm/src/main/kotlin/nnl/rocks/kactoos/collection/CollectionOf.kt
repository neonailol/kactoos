package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Iterable as [Collection].
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Iterable] on each
 * method call. It doesn't cache the data anyhow.
 * If you don't need this [Collection] to re-fresh
 * its content on every call, by doing round-trips to
 * the encapsulated iterable, use [StickyCollection].
 *
 * There is no thread-safety guarantee.
 *
 * @param T List type
 * @see StickyCollection
 * @since 0.1
 */
class CollectionOf<T : Any> : CollectionEnvelope<T> {

    constructor(src: Iterable<T>) : super(ScalarOf { src.toList() })

    /**
     * @param array An array of some elements
     */
    @SafeVarargs
    constructor(vararg array: T) : this(IterableOf<T>(array.iterator()))

    /**
     * @param src An [Iterator]
     * @since 0.21
     */
    constructor(src: Iterator<T>) : this(IterableOf<T>(src))
}
