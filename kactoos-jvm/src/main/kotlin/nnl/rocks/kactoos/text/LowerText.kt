package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import java.util.Locale

/**
 * Text in lower case.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The text
 * @param locale Locale
 * @since 0.1
 */
class LowerText(
    private val origin: Text,
    private val locale: Locale
) : Text {

    constructor(origin: Text) : this(origin, Locale.ENGLISH)

    override fun asString(): String = this.origin.asString().toLowerCase(this.locale)
}
