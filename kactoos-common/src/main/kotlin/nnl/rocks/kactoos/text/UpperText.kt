package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text in upper case.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.1
 */
class UpperText(
    origin: KText
) : TextEnvelope(
    { origin().toUpperCase() }
) {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )

}
