package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

import java.io.IOException

/**
 * Text without control characters (char &lt;= 32) only from right.
 *
 * @param origin The text
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.12
 */
class TrimmedRightText(private val origin: Text) : Text {

    @Throws(IOException::class)
    override fun asString(): String {
        val text = this.origin.asString()
        var cursor = text.length - 1
        while (cursor >= 0 && Character.isWhitespace(text[cursor])) {
            cursor = cursor - 1
        }
        return text.substring(0, cursor + 1)
    }

}
