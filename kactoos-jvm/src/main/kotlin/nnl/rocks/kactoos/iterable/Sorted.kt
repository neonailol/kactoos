package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Sorted
import nnl.rocks.kactoos.scalar.ScalarOf
import java.util.Comparator

/**
 * Sorted iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.7
 */
class Sorted<T : Comparable<T>> : IterableEnvelope<T> {

    constructor(
        cmp: Comparator<T>,
        src: Iterable<T>
    ) : super(
        ScalarOf {
            Iterable {
                Sorted<T>(
                    cmp, src.iterator()
                )
            }
        }
    )

    /**
     * @param src The underlying iterable
     */
    @SafeVarargs
    constructor(vararg src: T) : this(IterableOf<T>(src.iterator()))

    /**
     * If you're using this ctor you must be sure that type `T`
     * implements [Comparable] interface. Otherwise, there will be
     * a type casting exception in runtime.
     *
     * @param src The underlying iterable
     */
    constructor(src: Iterable<T>) : this(Comparator.naturalOrder<T>(), src)

    /**
     * Ctor.
     * @param args The underlying iterable
     * @param cmp The comparator
     */
    @SafeVarargs
    constructor(
        cmp: Comparator<T>,
        vararg args: T
    ) : this(cmp, IterableOf<T>(args.iterator()))
}
