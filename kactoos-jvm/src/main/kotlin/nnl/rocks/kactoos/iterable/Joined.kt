package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.collection.CollectionOf
import nnl.rocks.kactoos.iterator.Joined
import nnl.rocks.kactoos.scalar.Constant
import java.util.LinkedList

/**
 * A few Iterables joined together.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Type of item
 * @since 0.1
 */
class Joined<T : Any> : IterableEnvelope<T> {

    constructor(items: Iterable<Iterable<T>>) : super(
        Constant {
            val iterators = LinkedList<Iterator<T>>()
            for (item in items) {
                iterators.add(item.iterator())
            }
            CollectionOf(Joined<T>(iterators))
        }
    )

    /**
     * @param items Items to concatenate
     */
    @SafeVarargs
    constructor(vararg items: Iterable<T>) : this(IterableOf(items.iterator()))

    /**
     * @param items Items to concatenate
     * @since 0.21
     */
    constructor(items: Iterator<Iterable<T>>) : this(IterableOf(items))
}
