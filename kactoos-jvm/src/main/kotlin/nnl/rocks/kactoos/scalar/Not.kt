package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Logical negative.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * @param origin The scalar
 *
 *
 *
 * @since 0.7
 */
class Not(private val origin: Scalar<Boolean>) : Scalar<Boolean> {

    @Throws(Exception::class)
    override fun value(): Boolean = ! this.origin.value()
}
