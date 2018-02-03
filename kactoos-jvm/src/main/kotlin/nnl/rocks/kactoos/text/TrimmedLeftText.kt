package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

import java.io.IOException

/**
 * Text without control characters (char &lt;= 32) only from left.
 *
 * @param origin The text
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.12
 */
class TrimmedLeftText(private val origin: Text) : Text {

    @Throws(IOException::class)
    override fun asString(): String {
        val text = this.origin.asString()
        var cursor = 0
        while (cursor < text.length && Character.isWhitespace(text[cursor])) {
            cursor = cursor + 1
        }
        return text.substring(cursor)
    }
}
