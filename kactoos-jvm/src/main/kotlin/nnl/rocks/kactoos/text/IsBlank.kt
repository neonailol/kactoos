package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Determines if text is blank (consists of spaces) or no.
 *
 * @param origin The text
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class IsBlank(private val origin: Text) : KScalar<Boolean> {

    override fun invoke(): Boolean {
        return origin.asString().isBlank()
    }
}
