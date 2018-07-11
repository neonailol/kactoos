package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Join a Text.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class JoinedText private constructor(origin: KScalar<String>) : TextEnvelope(origin) {

    /**
     * @param separator Separator among texts
     * @param texts Texts to be joined
     */
    constructor(
        separator: Text,
        texts: Iterable<Text>
    ) : this({ texts.joinToString(separator.asString()) { it.asString() } })

    /**
     * @param separator Separator among strings
     * @param strings Strings to be joined
     */
    constructor(
        separator: String,
        vararg strings: String
    ) : this(
        separator,
        IterableOf(strings.asIterable())
    )

    /**
     * @param separator Separator among strings
     * @param strings Strings to be joined
     */
    constructor(
        separator: String,
        strings: Iterable<String>
    ) : this(
        TextOf(separator),
        Mapped({ string: String -> TextOf(string) }, strings)
    )

    /**
     * @param separator Separator among texts
     * @param texts Texts to be joined
     */
    constructor(
        separator: Text,
        vararg texts: Text
    ) : this(
        separator,
        IterableOf(texts.asIterable())
    )
}
