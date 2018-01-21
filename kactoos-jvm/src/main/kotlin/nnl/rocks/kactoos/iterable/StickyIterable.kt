package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.LinkedList

/**
 * Iterable that returns the same set of elements, always.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @since 0.1
 */
class StickyIterable<X : Any>(iterable: Iterable<X>) : IterableEnvelope<X>(
    StickyScalar<Iterable<X>>(
        ScalarOf {
            val temp = LinkedList<X>()
            for (item in iterable) {
                temp.add(item)
            }
            temp
        }
    )
) {

    /**
     * Ctor.
     * @param src The underlying iterable
     */
    @SafeVarargs
    constructor(vararg src: X) : this(IterableOf<X>(src.iterator()))
}
