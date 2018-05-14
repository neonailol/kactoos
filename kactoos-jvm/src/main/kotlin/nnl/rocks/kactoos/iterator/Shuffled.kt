package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.scalar.StickyScalar
import java.util.LinkedList

/**
 * Shuffled iterator.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Element type
 * @since 0.20
 */
class Shuffled<out T>(private val scalar: KScalar<Iterator<T>>) : Iterator<T> {

    constructor(iterator: Iterator<T>) : this(
        StickyScalar<Iterator<T>>(
             {
                val items = LinkedList<T>()
                while (iterator.hasNext()) {
                    items.add(iterator.next())
                }
                items.shuffle()
                items.iterator()
            }
        )
    )

    override fun hasNext(): Boolean = this.scalar().hasNext()

    override fun next(): T = this.scalar().next()
}
