package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.util.Comparator
import java.util.LinkedList

/**
 * Sorted iterator.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.7
 */
class Sorted<T : Comparable<T>>(
    comparator: Comparator<T>,
    iterator: Iterator<T>
) : Iterator<T> {

    /**
     * Sorted one.
     */
    private val scalar: UncheckedScalar<Iterator<T>>

    /**
     * If you're using this ctor you must be sure that type `T`
     * implements [Comparable] interface. Otherwise, there will be
     * a type casting exception in runtime.
     *
     * @param items The underlying iterator
     */
    constructor(items: Iterator<T>) : this(Comparator.naturalOrder<T>() as Comparator<T>, items)

    init {
        this.scalar = UncheckedScalar(
            StickyScalar<Iterator<T>>(
                Constant {
                    val items = LinkedList<T>()
                    while (iterator.hasNext()) {
                        items.add(iterator.next())
                    }
                    items.sortWith(comparator)
                    items.iterator()
                }
            )
        )
    }

    override fun hasNext(): Boolean = this.scalar().hasNext()

    override fun next(): T = this.scalar().next()
}
