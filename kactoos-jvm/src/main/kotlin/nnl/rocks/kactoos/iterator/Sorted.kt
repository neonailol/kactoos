package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.Comparator
import java.util.LinkedList

/**
 * Sorted iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.3
 */
class Sorted<T : Any>(
    private val scalar: KScalar<Iterator<T>>
) : Iterator<T> by scalar() {

    constructor(
        comparator: Comparator<T>,
        iterator: Iterator<T>
    ) : this(
        StickyScalar<Iterator<T>>(
            {
                val items = LinkedList<T>()
                while (iterator.hasNext()) {
                    items.add(iterator.next())
                }
                items.sortWith(comparator)
                items.iterator()
            }
        )
    )

    companion object {
        operator fun <T : Comparable<T>> invoke(items: Iterator<T>): Sorted<T> = Sorted(Comparator.naturalOrder<T>(), items)
    }

}
