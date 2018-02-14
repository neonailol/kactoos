package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.Constant
import java.util.Collections
import java.util.LinkedList

/**
 * Reverse iterator.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @see Filtered
 * @since 0.9
 */
class Reversed<X : Any>(src: Iterable<X>) : IterableEnvelope<X>(
    Constant {
        val list = LinkedList<X>()
        for (item in src) {
            list.add(item)
        }
        Collections.reverse(list)
        list
    }
) {

    /**
     * Ctor.
     * @param src Source iterable
     * @since 0.23
     */
    @SafeVarargs
    constructor(vararg src: X) : this(IterableOf<X>(src.iterator()))
}
