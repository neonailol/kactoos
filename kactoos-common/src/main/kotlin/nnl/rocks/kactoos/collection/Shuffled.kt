package nnl.rocks.kactoos.collection

/**
 * Shuffled collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Shuffled<out T : Any> : CollectionEnvelope<T> {

    constructor(src: Collection<T>) : super({ src.shuffled() })

    constructor(vararg src: T) : this(CollectionOf(src.asIterable()))

    constructor(src: Iterable<T>) : this(CollectionOf(src))
}
