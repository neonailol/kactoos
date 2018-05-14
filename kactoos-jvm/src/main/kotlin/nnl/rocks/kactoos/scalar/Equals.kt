package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar

/**
 * Equals.
 *
 * There is no thread-safety guarantee.
 *
 *
 * @param first The first scalar to compare.
 * @param second The second scalar to compare.
 * @param T Type of object to compare
 *
 *
 *
 * @since 0.9
 */
class Equals<in T : Comparable<T>>(
    private val first: KScalar<T>,
    private val second: KScalar<T>
) : KScalar<Boolean> {

    override fun invoke(): Boolean = this.first().compareTo(this.second()) == 0
}
