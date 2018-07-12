package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Rotate (circular shift) a String of shift characters.
 *
 * @since 0.4
 */
class RotatedText(
    origin: KText,
    move: Int
) : TextEnvelope(
    {
        var text = origin()
        val length = text.length
        if (length != 0 && move != 0 && move % length != 0) {
            text = with(StringBuilder(length)) {
                var offset = - (move % length)
                if (offset < 0) {
                    offset += text.length
                }
                append(text.substring(offset))
                append(text.substring(0, offset))
            }.toString()
        }
        text
    }
) {

    constructor(
        origin: Text,
        move: Int
    ) : this(
        { origin.asString() },
        move
    )
}
