package nnl.rocks.kactoos.collection

/**
 * Shuffled collection.
 *
 * Pay attention that shuffling will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire collection from the encapsulated object and shuffle it. If you
 * want to avoid that behaviour, decorate it with [StickyCollection].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.3
 */
class Shuffled<T : Any> : CollectionEnvelope<T> {

    constructor(src: Collection<T>) : super({ src.shuffled() })

    constructor(vararg src: T) : this(CollectionOf<T>(src.asIterable()))

    constructor(src: Iterable<T>) : this(CollectionOf<T>(src))
}
