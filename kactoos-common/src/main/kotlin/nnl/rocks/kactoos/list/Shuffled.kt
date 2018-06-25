package nnl.rocks.kactoos.list

/**
 * Shuffled list.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @see StickyList
 * @since 0.4
 */
class Shuffled<T : Any> : ListEnvelope<T> {

    constructor(collection: Collection<T>) : super({ collection.shuffled().toList() })

    constructor(vararg args: T) : this(ListOf(args.asIterable()))

    constructor(iterable: Iterable<T>) : this(ListOf(iterable))
}
