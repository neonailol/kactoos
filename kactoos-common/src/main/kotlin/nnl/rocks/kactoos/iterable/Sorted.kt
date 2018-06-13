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
class Sorted<T : Comparable<T>>(
    cmp: Comparator<T>,
    src: Iterable<T>
) : IterableEnvelope<T>({ IterableOf { Sorted(cmp, src.iterator()) } }) {

    constructor(
        vararg args: T
    ) : this(args.asIterable())

    constructor(
        src: Iterable<T>
    ) : this(naturalOrder(), src)

    constructor(
        cmp: Comparator<T>,
        vararg args: T
    ) : this(cmp, args.asIterable())
}
