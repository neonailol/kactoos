package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

/**
 * Text padded at start to reach the given length.
 *
 * There is thread safe.
 *
 * @param text The text
 * @param length The minimum length of the resulting string
 * @param symbol The padding symbol
 * @since 0.5
 */
class PaddedStartText(
    text: Text, length: Int, symbol: Char
) : TextEnvelope({
                     val original = text.asString()
                     JoinedText(
                         TextOf(""),
                         RepeatedText(
                             TextOf(symbol), length - original.length
                         ),
                         text
                     ).asString()
                 })
