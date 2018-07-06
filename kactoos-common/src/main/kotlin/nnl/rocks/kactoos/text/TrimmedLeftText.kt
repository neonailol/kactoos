package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text with leading whitespace removed.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The text
 * @since 0.5
 */
class TrimmedLeftText(origin: KText) : TextEnvelope({ origin().trimStart() }) {

    constructor(text: Text) : this({ text.asString() })

}
