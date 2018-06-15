package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.iterable.Mapped

/**
 * Split the Text.
 *
 * @param origin The text
 * @param regex The regex
 *
 *
 *
 * @since 0.9
 */
class SplitText(
    private val origin: UncheckedText,
    private val regex: UncheckedText
) : Iterable<Text> {

    /**
     * @param text The text
     * @param rgx The regex
     */
    constructor(
        text: String,
        rgx: String
    ) : this(
        UncheckedText(TextOf(text)),
        UncheckedText(TextOf(rgx))
    )

    /**
     * @param text The text
     * @param rgx The regex
     */
    constructor(
        text: String,
        rgx: Text
    ) : this(UncheckedText(text), UncheckedText(rgx))

    /**
     * @param text The text
     * @param rgx The regex
     */
    constructor(
        text: Text,
        rgx: String
    ) : this(UncheckedText(text), UncheckedText(rgx))

    /**
     * @param text The text
     * @param rgx The regex
     */
    constructor(
        text: Text,
        rgx: Text
    ) : this(UncheckedText(text), UncheckedText(rgx))

    override fun iterator(): Iterator<Text> {
        return Mapped(
            FuncOf<String, Text> { TextOf(it) },
            IterableOf(
                this.origin.asString().split(this.regex.asString().toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray().asIterable()
            )
        ).iterator()
    }
}
