package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

import java.io.IOException
import java.util.Locale

/**
 * Text in upper case.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The text
 * @param locale Locale
 * @since 0.1
 */
class UpperText(
    private val origin: Text,
    private val locale: Locale
) : Text {

    constructor(origin: Text) : this(origin, Locale.ENGLISH)

    @Throws(IOException::class)
    override fun asString(): String = this.origin.asString().toUpperCase(this.locale)
}
