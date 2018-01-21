package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Creates scalar out of [T]
 *
 * @param T Type of scalar
 * @since 0.2
 */
class ScalarOf<out T : Any>(
    private val origin: KScalar<T>
) : Scalar<T> {

    constructor(origin: T) : this({ origin })

    override fun value(): T = origin()
}
