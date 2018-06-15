package nnl.rocks.kactoos.list

/**
 * Sorted list.
 *
 * Pay attention that sorting will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire list from the encapsulated object and sort it. If you
 * want to avoid that "side-effect", decorate it with [StickyList].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @see StickyList
 * @since 0.4
 */
class Sorted<T : Comparable<T>> : ListEnvelope<T> {

    constructor(cmp: Comparator<T>, src: Collection<T>) : super({ src.sortedWith(cmp) })

    constructor(vararg src: T) : this(src.iterator())

    constructor(src: Iterator<T>) : this(Iterable { src })

    constructor(src: Iterable<T>) : this(naturalOrder(), ListOf(src))

    constructor(cmp: Comparator<T>, vararg src: T) : this(cmp, ListOf(src.asIterable()))
}
