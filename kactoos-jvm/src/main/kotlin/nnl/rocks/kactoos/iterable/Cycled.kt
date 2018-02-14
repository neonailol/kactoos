package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Cycled
import nnl.rocks.kactoos.scalar.Constant

/**
 * Cycled Iterable.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Type of item
 * @since 0.8
 */
class Cycled<T : Any>(itr: Iterable<T>) : IterableEnvelope<T>(
    Constant {
        Iterable {
            Cycled<T>(itr)
        }
    }
) {

    /**
     * @param itr Iterable
     * @since 0.23
     */
    @SafeVarargs
    constructor(vararg itr: T) : this(IterableOf<T>(itr.iterator()))

    /**
     * @param itr Iterable
     * @since 0.21
     */
    constructor(itr: Iterator<T>) : this(IterableOf<T>(itr))
}
