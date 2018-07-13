package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text padded at end to reach the given length.
 *
 * There is thread safe.
 *
 * @param text The text
 * @param length The minimum length of the resulting string
 * @param symbol The padding symbol
 * @since 0.4
 */
class PaddedEndText(
    text: KText,
    length: Int,
    symbol: Char
) : TextEnvelope(
    {
        text().padEnd(if (length < 0) 0 else length, symbol)
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
