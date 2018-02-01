package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Equals.
 *
 * There is no thread-safety guarantee.
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * @param first The first scalar to compare.
 * @param second The second scalar to compare.
 * @param T Type of object to compare
 * @since 0.3
 */
class Equals<in T : Comparable<T>>(
    private val first: Scalar<T>,
    private val second: Scalar<T>
) : Scalar<Boolean> {

    constructor(
        fst: KScalar<T>,
        scd: KScalar<T>
    ) : this(
        ScalarOf { fst.invoke() },
        ScalarOf { scd.invoke() }
    )

    @Throws(Exception::class)
    override fun value(): Boolean = this.first.value().compareTo(this.second.value()) == 0
}
