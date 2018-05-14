package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.ArrayList
import java.util.Collections

/**
 * Collection decorator that goes through the list only once.
 *
 * There is no thread-safety guarantee.
 *
 * @param E Type of item
 * @since 0.16
 */
class StickyCollection<E : Any> : CollectionEnvelope<E> {

    constructor(list: Collection<E>) : super(
        StickyScalar<Collection<E>>(
            {
                val temp = ArrayList<E>(list.size)
                temp.addAll(list)
                Collections.unmodifiableCollection<E>(temp)
            }
        )
    )

    /**
     * @param items The array
     */
    @SafeVarargs
    constructor(vararg items: E) : this(IterableOf<E>(items.iterator()))

    /**
     * @param items The array
     * @since 0.21
     */
    constructor(items: Iterator<E>) : this(IterableOf<E>(items))

    /**
     * @param items The array
     */
    constructor(items: Iterable<E>) : this(CollectionOf<E>(items))
}
