package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Shuffled list.
 *
 * Pay attention that shuffling will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire list from the encapsulated object and sort it. If you
 * want to avoid that "side-effect", decorate it with
 * [StickyList].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @see StickyList
 * @since 0.4
 */
class Shuffled<T : Any> : ListEnvelope<T> {

    constructor(src: Collection<T>) : super({ src.shuffled().toList() })

    constructor(vararg src: T) : this(ListOf(src.iterator()))

    constructor(src: Iterator<T>) : this(IterableOf(src))

    constructor(src: Iterable<T>) : this(ListOf(src))
}
