package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.collection.CollectionOf
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

    constructor(items: Iterable<Iterable<T>>) : super(
        {
            val iterators = items.mapTo(ArrayList()) { it.iterator() }
            CollectionOf(Joined(iterators))
        }
    )

    constructor(vararg items: Iterable<T>) : this(IterableOf(items.iterator()))

    constructor(items: Iterator<Iterable<T>>) : this(IterableOf(items))
}
