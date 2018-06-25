package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Sorted list.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @see StickyList
 * @since 0.4
 */
class Sorted<T : Any> : ListEnvelope<T> {

    constructor(cmp: Comparator<T>, src: Collection<T>) : super({ src.sortedWith(cmp) })

    constructor(cmp: Comparator<T>, vararg src: T) : this(cmp, ListOf(src.asIterable()))

    companion object {
        operator fun <T : Comparable<T>> invoke(src: Iterable<T>): Sorted<T> {
            return Sorted(naturalOrder<T>(), ListOf(src))
        }

        operator fun <T : Comparable<T>> invoke(vararg src: T): Sorted<T> {
            return Sorted(IterableOf(src.asIterable()))
        }
    }
}
