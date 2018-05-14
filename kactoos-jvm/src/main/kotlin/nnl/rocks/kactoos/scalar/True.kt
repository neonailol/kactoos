package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar

/**
 * Logical truth.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class True : KScalar<Boolean> {

    override fun invoke(): Boolean = true
}
