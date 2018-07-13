package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text

/**
 * Text as [Boolean].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.2
 */
class BoolOf(
    private val origin: KText
) : Scalar<Boolean> {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )

    constructor(
        origin: String
    ) : this(
        { origin }
    )

    override fun invoke(): Boolean = origin().toBoolean()
}
