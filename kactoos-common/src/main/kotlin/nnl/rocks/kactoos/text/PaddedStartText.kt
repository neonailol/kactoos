package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text padded at start to reach the given length.
 *
 * There is thread safe.
 *
 * @param text The text
 * @param length The minimum length of the resulting string
 * @param symbol The padding symbol
 * @since 0.4
 */
class PaddedStartText(
    text: KText,
    length: Int,
    symbol: Char
) : TextEnvelope(
    {
        text().padStart(if (length < 0) 0 else length, symbol)
    }
) {

    constructor(
        text: Text,
        length: Int,
        symbol: Char
    ) : this(
        { text.asString() },
        length,
        symbol
    )
}
