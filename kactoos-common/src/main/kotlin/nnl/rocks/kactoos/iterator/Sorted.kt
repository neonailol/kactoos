package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.StickyScalar

/**
 * Sorted iterator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Element type
 * @since 0.3
 */
class Sorted<out T : Any> private constructor(
    private val scalar: KScalar<Iterator<T>>
) : Iterator<T> by scalar() {

    private constructor(scalar: Scalar<Iterator<T>>) : this({ scalar() })

    constructor(
        comparator: Comparator<T>,
        iterator: Iterator<T>
    ) : this(
        StickyScalar<Iterator<T>> {
            Immutable(iterator.asSequence().sortedWith(comparator).iterator())
        }
    )

    companion object {
        operator fun <T : Comparable<T>> invoke(
            items: Iterator<T>
        ): Sorted<T> = Sorted(naturalOrder(), items)
    }

}
