package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.iterator.Joined

/**
 * A few Iterables joined together.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of item
 * @since 0.1
 */
class Joined<T : Any> : IterableEnvelope<T> {

    constructor(items: Iterable<Iterable<T>>) : super(IterableOf { Joined(items.map { it.iterator() }) })

    constructor(vararg items: Iterable<T>) : this(items.asIterable())

}
