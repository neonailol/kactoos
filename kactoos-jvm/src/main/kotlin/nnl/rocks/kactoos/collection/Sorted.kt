package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf

/**
 * Sorted collection.
 *
 * Pay attention that sorting will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire collection from the encapsulated object and sort it. If you
 * want to avoid that "side-effect", decorate it with
 * [StickyCollection].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.19
 */
class Sorted<T : Comparable<T>> : CollectionEnvelope<T> {

    constructor(cmp: Comparator<T>, src: Collection<T>) : super({ src.sortedWith(cmp) })

    constructor(vararg src: T) : this(ListOf<T>(src.asIterable()))

    /**
     * If you're using this ctor you must be sure that type `T`
     * implements [Comparable] interface. Otherwise, there will be
     * a type casting exception in runtime.
     * @param src The underlying collection
     */
    constructor(src: Iterable<T>) : this(
        Comparator.naturalOrder<T>() as Comparator<T>,
        CollectionOf<T>(src)
    )

    /**
     * @param src The underlying collection
     * @param cmp The comparator
     */
    constructor(
        cmp: Comparator<T>,
        vararg src: T
    ) : this(cmp, CollectionOf<T>(src.asIterable()))

    /**
     * @param src The underlying collection
     * @param cmp The comparator
     */
    constructor(
        cmp: Comparator<T>,
        src: Iterable<T>
    ) : this(cmp, CollectionOf<T>(src))
}
