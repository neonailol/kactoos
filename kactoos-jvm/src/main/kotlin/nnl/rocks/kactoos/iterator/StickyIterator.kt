package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.util.LinkedList

/**
 * Iterator that returns the same set of elements always.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of item
 * @since 0.8
 */
class StickyIterator<X : Any>(iterator: Iterator<X>) : Iterator<X> {

    /**
     * The gate.
     */
    private val gate: UncheckedScalar<Iterator<X>>

    init {
        this.gate = UncheckedScalar(
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
    }

    /**
     * @param items Items to iterate
     */
    @SafeVarargs
    constructor(vararg items: X) : this(IterableOf<X>(items.iterator()).iterator())

    override fun hasNext(): Boolean = this.gate.value().hasNext()

    override fun next(): X = this.gate.value().next()
}
