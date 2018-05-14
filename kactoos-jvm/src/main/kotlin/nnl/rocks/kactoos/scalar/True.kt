package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Logical truth.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class True : Scalar<Boolean> {

    override fun invoke(): Boolean = true
}
