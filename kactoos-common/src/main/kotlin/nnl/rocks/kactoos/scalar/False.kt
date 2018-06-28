package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

/**
 * Logical false.
 *
 * This class is thread-safe.
 *
 * @since 0.4
 */
class False : Scalar<Boolean> {

    override fun invoke(): Boolean = false
}
