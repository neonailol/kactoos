package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import java.io.IOException

/**
 * Rotate (circular shift) a String of shift characters.
 *
 * @param origin The text
 * @param move The shift
 *
 *
 *
 * @since 0.12
 */
class RotatedText(
    private val origin: Text,
    private val move: Int
) : Text {

    @Throws(IOException::class)
    override fun asString(): String {
        var text = this.origin.asString()
        val length = text.length
        if (length != 0 && this.move != 0 && this.move % length != 0) {
            val builder = StringBuilder(length)
            var offset = - (this.move % length)
            if (offset < 0) {
                offset = text.length + offset
            }
            text = builder.append(
                text.substring(offset)
            ).append(
                text.substring(0, offset)
            ).toString()
        }
        return text
    }
}
