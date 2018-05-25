package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Shuffled iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.5
 */
class Shuffled<out T> private constructor(private val scalar: KScalar<Iterator<T>>) : Iterator<T> {

    private constructor(scalar: Scalar<Iterator<T>>) : this({ scalar() })

    constructor(iterator: Iterator<T>) : this(
        StickyScalar<Iterator<T>>(
            {
                val items = mutableListOf<T>()
                while (iterator.hasNext()) {
                    items.add(iterator.next())
                }
                items.shuffle()
                items.iterator()
            }
        )
    )

    override fun hasNext(): Boolean = scalar().hasNext()

    override fun next(): T = scalar().next()
}
