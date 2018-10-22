package nnl.rocks.kactoos.collection

/**
 * Iterable as [Collection].
 *
 * This class should be used very carefully. You must understand that
 * it will fetch the entire content of the encapsulated [Iterable] on each
 * method call. It doesn't cache the data anyhow.
 * If you don't need this [Collection] to re-fresh
 * its content on every call, by doing round-trips to
 * the encapsulated iterable, use [Sticky].
 *
 * There is no thread-safety guarantee.
 *
 * @param T List type
 * @see Sticky
 * @since 0.1
 */
class CollectionOf<out T : Any> : CollectionEnvelope<T> {

    constructor(src: Iterable<T>) : super({ src.toList() })

    constructor(vararg array: T) : this(array.asIterable())

}
