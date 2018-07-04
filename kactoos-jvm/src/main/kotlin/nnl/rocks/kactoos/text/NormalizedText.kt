package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Normalize (replace sequences of whitespace characters by a single space) a Text.
 *
 * @since 0.4
 */
class NormalizedText private constructor(origin: KScalar<String>) : TextEnvelope(origin) {

    constructor(origin: Text) : this(
        {
            TrimmedText(origin).asString().replace(Regex("\\s+"), " ")
        }
    )

    constructor(text: String) : this(TextOf(text))
}
