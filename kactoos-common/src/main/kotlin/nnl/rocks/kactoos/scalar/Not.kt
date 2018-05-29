package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

/**
 * Logical negative.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The scalar
 * @since 0.5
 */
class Not(private val origin: KScalar<Boolean>) : Scalar<Boolean> {

    constructor(origin: Scalar<Boolean>) : this({ origin() })

    constructor(origin: Boolean) : this({ origin })

    override fun invoke(): Boolean = origin().not()
}
