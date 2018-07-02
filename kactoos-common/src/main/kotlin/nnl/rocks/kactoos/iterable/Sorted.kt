package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Sorted

/**
 * Sorted iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.4
 */
class Sorted<out T : Any>(
    cmp: Comparator<T>,
    src: Iterable<T>
) : IterableEnvelope<T>({ IterableOf { Sorted(cmp, src.iterator()) } }) {

    constructor(
        cmp: Comparator<T>,
        vararg args: T
    ) : this(cmp, args.asIterable())

    companion object {
        
        operator fun <T : Comparable<T>> invoke(
            origin: Iterable<T>
        ) = Sorted(naturalOrder<T>(), origin)

        operator fun <T : Comparable<T>> invoke(
            vararg args: T
        ) = Sorted(args.asIterable())
    }
}
