package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar

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
class Not(private val origin: KScalar<Boolean>) : KScalar<Boolean> {

    override fun invoke(): Boolean = ! this.origin()
}
