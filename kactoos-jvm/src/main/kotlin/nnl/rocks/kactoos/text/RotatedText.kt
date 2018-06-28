package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Rotate (circular shift) a String of shift characters.
 *
 * @since 0.4
 */
class RotatedText private constructor(origin: KScalar<String>) : TextEnvelope(origin) {

    /**
     * @param origin The text
     * @param move The shift
     */
    constructor(origin: Text, move: Int) : this(
        {
            var text = origin.asString()
            val length = text.length
            if (length != 0 && move != 0 && move % length != 0) {
                val builder = StringBuilder(length)
                var offset = - (move % length)
                if (offset < 0) {
                    offset += text.length
                }
                text = builder.append(
                    text.substring(offset)
                ).append(
                    text.substring(0, offset)
                ).toString()
            }
            text
        }
    )
}
