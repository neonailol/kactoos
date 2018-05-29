package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Cycled

/**
 * Cycled Iterable.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.4
 */
class Cycled<T : Any>(itr: Iterable<T>) : IterableEnvelope<T>(
     {
        Iterable {
            Cycled<T>(itr)
        }
    }
) {

    constructor(vararg itr: T) : this(IterableOf<T>(itr.iterator()))

    constructor(itr: Iterator<T>) : this(IterableOf<T>(itr))
}
