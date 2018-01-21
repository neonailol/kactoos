package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Iterable as [List].
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [List] on each
 * method call. It doesn't cache the data anyhow. If you don't
 * need this [List] to re-fresh its content on every call,
 * by doing round-trips to the encapsulated iterable, decorate it with
 * [StickyList].
 *
 * There is no thread-safety guarantee.
 *
 * @param T List type
 * @see StickyList
 * @since 0.1
 */
class ListOf<T : Any> : ListEnvelope<T> {

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
    constructor(src: Iterator<T>) : this(IterableOf(src))
}
