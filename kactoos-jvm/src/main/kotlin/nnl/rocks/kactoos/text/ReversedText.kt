package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Reverse the Text.
 *
 * @since 0.2
 */
class ReversedText private constructor(text: KScalar<String>) : TextEnvelope(text) {

    constructor(origin: Text) : this(
        {
            StringBuilder(origin.asString()).reverse().toString()
        }
    )
}
