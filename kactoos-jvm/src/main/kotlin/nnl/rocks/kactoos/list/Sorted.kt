package nnl.rocks.kactoos.list

import java.util.ArrayList
import java.util.Collections
import java.util.Comparator

/**
 * Sorted list.
 *
 * Pay attention that sorting will happen on each operation
 * with the collection. Every time you touch it, it will fetch the
 * entire list from the encapsulated object and sort it. If you
 * want to avoid that "side-effect", decorate it with
 * [StickyList].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @see StickyList
 * @since 0.19
 */
class Sorted<T : Comparable<T>> : ListEnvelope<T> {

    constructor(
        cmp: Comparator<T>,
        src: Collection<T>
    ) : super(
         {
            val items = ArrayList<T>(src.size)
            items.addAll(src); items.sortWith(cmp)
            Collections.unmodifiableList<T>(items)
        }
    )

    /**
     * @param src The underlying collection
     */
    @SafeVarargs
    constructor(vararg src: T) : this(ListOf<T>(src.iterator()))

    /**
     * If you're using this ctor you must be sure that type `T`
     * implements [Comparable] interface. Otherwise, there will be
     * a type casting exception in runtime.
     *
     * @param src The underlying collection
     * @since 0.21
     */
    constructor(src: Iterator<T>) : this(Iterable { src })

    /**
     * If you're using this ctor you must be sure that type `T`
     * implements [Comparable] interface. Otherwise, there will be
     * a type casting exception in runtime.
     *
     * @param src The underlying collection
     */
    constructor(src: Iterable<T>) : this(Comparator.naturalOrder<T>() as Comparator<T>, ListOf<T>(src))

    /**
     * @param src The underlying collection
     * @param cmp The comparator
     */
    @SafeVarargs
    constructor(
        cmp: Comparator<T>,
        vararg src: T
    ) : this(cmp, ListOf<T>(src.iterator()))
}
