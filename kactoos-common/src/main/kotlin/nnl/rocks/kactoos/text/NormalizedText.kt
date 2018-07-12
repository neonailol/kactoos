package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Normalize (replace sequences of whitespace characters by a single space) a Text.
 *
 * @since 0.4
 */
class NormalizedText(
    origin: KText
) : TextEnvelope(
    {
        TrimmedText(origin)
            .asString()
            .replace(Regex("\\s+"), " ")
    }
) {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )

    constructor(
        text: String
    ) : this(
        TextOf { text }
    )
}
