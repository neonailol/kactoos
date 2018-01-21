package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar

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
class False : Scalar<Boolean> {

    override fun value(): Boolean = false
}
