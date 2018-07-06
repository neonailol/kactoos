package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text with trailing whitespace removed.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The text
 * @since 0.5
 */
class TrimmedRightText(private val origin: KText) : TextEnvelope({ origin().trimEnd() }) {

    constructor(text: Text) : this({ text.asString() })

}
