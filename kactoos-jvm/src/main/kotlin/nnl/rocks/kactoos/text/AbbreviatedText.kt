package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

import java.io.IOException

/**
 * Abbreviates a Text using ellipses.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The Text
 * @param width Max width of the result string
 * @since 0.3
 */
class AbbreviatedText @JvmOverloads constructor(
    private val origin: Text,
    private val width: Int = AbbreviatedText.MAX_WIDTH
) : Text {

    /**
     *  By default, the max line width is 80 characters.
     * @param text The Text
     */
    constructor(text: String) : this(TextOf(text))

    /**
     * @param text A String
     * @param max Max width of the result string
     */
    constructor(
        text: String,
        max: Int
    ) : this(TextOf(text), max)

    @Throws(IOException::class)
    override fun asString(): String {
        val abbreviated: Text
        if (this.origin.asString().length <= this.width) {
            abbreviated = this.origin
        } else {
            abbreviated = FormattedText(
                "%s...",
                SubText(
                    this.origin,
                    0,
                    this.width - AbbreviatedText.ELLIPSES_WIDTH
                ).asString()
            )
        }
        return abbreviated.asString()
    }

    companion object {

        /**
         * The default max line width.
         */
        private val MAX_WIDTH = 80

        /**
         * The ellipses width.
         */
        private val ELLIPSES_WIDTH = 3
    }
}
