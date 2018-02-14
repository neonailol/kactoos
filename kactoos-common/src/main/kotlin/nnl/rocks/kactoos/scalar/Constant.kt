package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Constant value that never changes.
 *
 * @param T Type of scalar
 * @since 0.3
 */
class Constant<out T : Any>(
    private val origin: KScalar<T>
) : Scalar<T> {

    constructor(origin: T) : this({ origin })

    override fun value(): T = origin()
}
