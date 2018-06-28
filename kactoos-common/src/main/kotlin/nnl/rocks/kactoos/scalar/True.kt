package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Logical truth.
 *
 * This class is thread-safe.
 *
 * @since 0.4
 */
class True : Scalar<Boolean> {

    override fun invoke(): Boolean = true
}
