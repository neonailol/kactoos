package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Logical negative.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param origin The scalar
 *
 *
 *
 * @since 0.7
 */
class Not(private val origin: Scalar<Boolean>) : Scalar<Boolean> {

    @Throws(Exception::class)
    override fun invoke(): Boolean = ! this.origin()
}
