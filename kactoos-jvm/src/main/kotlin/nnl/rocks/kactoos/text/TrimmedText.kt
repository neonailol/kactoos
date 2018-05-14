package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

/**
 * Text without control characters (char &lt;= 32) from both ends.
 *
 * @param origin The text
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class TrimmedText(private val origin: Text) : Text {

    override fun asString(): String {
        return this.origin.asString().trim { it <= ' ' }
    }
}
