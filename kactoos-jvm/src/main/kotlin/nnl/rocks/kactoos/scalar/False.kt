package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar

/**
 * Logical false.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.7
 */
class False : KScalar<Boolean> {

    override fun invoke(): Boolean = false
}
