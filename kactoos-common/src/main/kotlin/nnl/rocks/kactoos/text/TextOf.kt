package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Text from various inputs
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class TextOf(origin: KText) : TextEnvelope(origin) {

    constructor(text: Text) : this({ text.asString() })

    constructor(iterable: Iterable<Any>) : this(
        JoinedText(
            ", ",
            Mapped(
                func = FuncOf { it.toString() },
                iterable = iterable
            )
        )
    )
}
