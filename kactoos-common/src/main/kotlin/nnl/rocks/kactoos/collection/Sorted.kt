package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf

/**
 * Sorted collection.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Sorted<T : Any> : CollectionEnvelope<T> {

    constructor(cmp: Comparator<T>, src: Collection<T>) : super({ src.sortedWith(cmp) })

    constructor(
        cmp: Comparator<T>,
        vararg src: T
    ) : this(cmp, CollectionOf(src.asIterable()))

    constructor(
        cmp: Comparator<T>,
        src: Iterable<T>
    ) : this(cmp, CollectionOf(src))

    companion object {
        operator fun <T : Comparable<T>> invoke(src: Iterable<T>): Sorted<T> {
            return Sorted(naturalOrder<T>(), src)
        }

        operator fun <T : Comparable<T>> invoke(vararg src: T): Sorted<T> {
            return Sorted(naturalOrder<T>(), IterableOf(src.asIterable()))
        }
    }
}
