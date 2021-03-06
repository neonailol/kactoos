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
class Cycled<out T : Any>(itr: Iterable<T>) : IterableEnvelope<T>(IterableOf { Cycled { itr } }) {

    constructor(vararg args: T) : this(args.asIterable())
}
