package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text

/**
 * Determines if text is blank (consists of spaces) or no.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The text
 * @since 0.1
 */
class IsBlank(private val origin: KText) : Scalar<Boolean> {

    constructor(origin: Text) : this({ origin.asString() })

    override fun invoke(): Boolean = origin().isBlank()
}
