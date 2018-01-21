package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Limited
import nnl.rocks.kactoos.scalar.ScalarOf

/**
 * Limited iterable.
 *
 *
 * This is a view of an existing iterable containing the given number of its
 * first elements.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.6
 */
class Limited<T : Any>(
    lmt: Int,
    itr: Iterable<T>
) : IterableEnvelope<T>(
    ScalarOf {
        Iterable {
            Limited<T>(lmt, itr.iterator())
        }
    }
) {

    /**
     * @param lmt The requested number of elements
     * @param itr The underlying iterable
     * @since 0.23
     */
    @SafeVarargs
    constructor(
        lmt: Int,
        vararg itr: T
    ) : this(lmt, IterableOf<T>(itr.iterator()))

    /**
     * @param lmt The requested number of elements
     * @param itr The underlying iterable
     */
    constructor(
        lmt: Int,
        itr: Iterator<T>
    ) : this(lmt, IterableOf<T>(itr))
}
