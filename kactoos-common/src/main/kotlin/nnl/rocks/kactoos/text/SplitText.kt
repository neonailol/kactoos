package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Split the Text.
 *
 * @since 0.5
 */
class SplitText(
    private val origin: KText,
    private val regex: KText
) : Iterable<Text> {

    constructor(
        text: String,
        rgx: String
    ) : this(
        { text },
        { rgx }
    )

    override fun iterator(): Iterator<Text> {
        return Mapped(
            { it: String -> TextOf { it } },
            IterableOf(
                origin()
                    .split(regex().toRegex())
                    .dropLastWhile { it.isEmpty() }
                    .asIterable()
            )
        ).iterator()
    }
}
