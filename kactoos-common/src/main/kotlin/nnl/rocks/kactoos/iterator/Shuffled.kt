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
 * @since 0.4
 */
class Shuffled<out T : Any> private constructor(
    private val scalar: KScalar<Iterator<T>>
) : Iterator<T> by scalar() {

    private constructor(scalar: Scalar<Iterator<T>>) : this({ scalar() })

    constructor(iterator: Iterator<T>) : this(
        StickyScalar<Iterator<T>> {
            iterator.asSequence().asIterable().shuffled().iterator()
        }
    )
}
