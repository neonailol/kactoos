package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Text in lower case.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.1
 */
class LowerText(
    origin: KText
) : TextEnvelope(
    { origin().toLowerCase() }
) {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )

}
