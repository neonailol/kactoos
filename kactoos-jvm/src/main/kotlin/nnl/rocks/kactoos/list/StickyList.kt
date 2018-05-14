package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.Collections
import java.util.LinkedList

/**
 * List decorator that goes through the list only once.
 *
 *
 * The list is read only.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @since 0.8
 */
class StickyList<X : Any>(list: Collection<X>) : ListEnvelope<X>(
    StickyScalar<List<X>>(
         {
            val temp = LinkedList<X>()
            temp.addAll(list)
            Collections.unmodifiableList<X>(temp)
        }
    )
) {

    /**
     * @param items The array
     */
    @SafeVarargs
    constructor(vararg items: X) : this(IterableOf<X>(items.iterator()))

    /**
     * @param items The array
     */
    constructor(items: Iterable<X>) : this(ListOf<X>(items))

    /**
     * @param items The array
     * @since 0.21
     */
    constructor(items: Iterator<X>) : this(ListOf<X>(items))
}
