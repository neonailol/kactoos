package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

/**
 * Normalize (replace sequences of whitespace characters by a single space) a Text.
 *
 * @param origin A Text
 *
 *
 *
 * @since 0.9
 */
class NormalizedText(private val origin: Text) : Text {

    /**
     * Ctor.
     * @param text A Text
     */
    constructor(text: String) : this(TextOf(text))

    override fun asString(): String = TrimmedText(this.origin).asString().replace("\\s+".toRegex(), " ")
}
