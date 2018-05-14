package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.LinkedList

/**
 * Iterator that returns the same set of elements always.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.3
 */
class StickyIterator<X : Any>(
    private val gate: Scalar<Iterator<X>>
) : Iterator<X> by gate() {

    constructor(iterator: Iterator<X>) : this(
        StickyScalar<Iterator<X>>(
            Constant {
                val temp = LinkedList<X>()
                while (iterator.hasNext()) {
                    temp.add(iterator.next())
                }
                temp.iterator()
            }
        )
    )

    /**
     * @param items Items to iterate over
     */
    constructor(vararg items: X) : this(IterableOf<X>(items.iterator()).iterator())
}
