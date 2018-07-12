package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Repeat an text count times.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class RepeatedText(
    origin: KText,
    count: Int
) : TextEnvelope({ origin().repeat(count) }) {

    constructor(
        origin: Text,
        count: Int
    ) : this(
        { origin.asString() },
        count
    )

    constructor(
        text: String,
        count: Int
    ) : this(
        TextOf { text },
        count
    )
}
