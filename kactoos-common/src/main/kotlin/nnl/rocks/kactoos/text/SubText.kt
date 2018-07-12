package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Extract a substring from a Text.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class SubText(
    origin: KText,
    start: Int,
    end: Int
) : TextEnvelope(
    {
        val text = origin()
        val begin = when {
            start < 0 -> 0
            else -> start
        }
        val finish = when {
            text.length < end -> text.length
            else -> end
        }
        text.substring(begin, finish)
    }
) {

    constructor(
        origin: Text,
        start: KScalar<Int>,
        end: KScalar<Int>
    ) : this(
        { origin.asString() },
        start(),
        end()
    )

    constructor(
        text: String,
        start: Int
    ) : this(
        TextOf { text },
        start
    )

    constructor(
        text: String,
        start: Int,
        end: Int
    ) : this(
        TextOf { text },
        start,
        end
    )

    constructor(
        text: Text,
        start: Int
    ) : this(
        text,
        { start },
        { text.asString().length }
    )

    constructor(
        text: Text,
        start: Int,
        end: Int
    ) : this(
        text,
        { start },
        { end }
    )
}
