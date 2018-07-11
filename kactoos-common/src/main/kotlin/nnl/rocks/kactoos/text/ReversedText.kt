package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Reverse the Text.
 *
 * @since 0.2
 */
class ReversedText(
    origin: KText
) : TextEnvelope(
    { StringBuilder(origin()).reverse().toString() }
) {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )
}
