package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Iterator that returns the same set of elements always.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of item
 * @since 0.3
 */
class StickyIterator<X : Any> private constructor(
    private val gate: KScalar<Iterator<X>>
) : Iterator<X> by gate() {

    private constructor(gate: Scalar<Iterator<X>>) : this({ gate() })

    constructor(iterator: Iterator<X>) : this(
        StickyScalar<Iterator<X>>(
            {
                val temp = mutableListOf<X>()
                while (iterator.hasNext()) {
                    temp.add(iterator.next())
                }
                temp.iterator()
            }
        )
    )

    constructor(vararg items: X) : this(IterableOf<X>(items.iterator()).iterator())
}
