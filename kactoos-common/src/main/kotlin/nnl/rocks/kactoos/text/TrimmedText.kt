package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text without whitespace characters from both ends.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.1
 */
class TrimmedText(origin: KText) : TextEnvelope({ origin().trim() }) {

    constructor(origin: Text) : this({ origin.asString() })
}
