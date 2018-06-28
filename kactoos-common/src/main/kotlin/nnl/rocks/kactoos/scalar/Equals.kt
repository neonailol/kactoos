package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Equals.
 *
 * There is no thread-safety guarantee.
 *
 * @param left The left scalar to compare.
 * @param right The right scalar to compare.
 * @param T Type of object to compare
 * @since 0.4
 */
class Equals<in T : Comparable<T>>(
    private val left: KScalar<T>,
    private val right: KScalar<T>
) : Scalar<Boolean> {

    constructor(left: Scalar<T>, right: Scalar<T>) : this({ left() }, { right() })

    override fun invoke(): Boolean = left().compareTo(right()) == 0
}
