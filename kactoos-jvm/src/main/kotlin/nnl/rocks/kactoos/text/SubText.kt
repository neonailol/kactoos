package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Extract a substring from a Text.
 *
 * @param origin The Text
 * @param start Start position in the text
 * @param end End position in the text
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.11
 */
class SubText(
    private val origin: Text,
    private val start: KScalar<Int>,
    private val end: KScalar<Int>
) : Text {

    /**
     * @param text The String
     * @param strt Start position in the text
     */
    constructor(
        text: String,
        strt: Int
    ) : this(TextOf(text), strt)

    /**
     * @param text The String
     * @param strt Start position in the text
     * @param finish End position in the text
     */
    constructor(
        text: String,
        strt: Int,
        finish: Int
    ) : this(TextOf(text), strt, finish)

    /**
     * @param text The Text
     * @param strt Start position in the text
     */
    constructor(
        text: Text,
        strt: Int
    ) : this(text,  { strt },  { text.asString().length })

    /**
     * @param text The Text
     * @param strt Start position in the text
     * @param finish End position in the text
     */
    constructor(
        text: Text,
        strt: Int,
        finish: Int
    ) : this(text,  { strt },  { finish })

    override fun asString(): String {
        var begin = this.start()
        if (begin < 0) {
            begin = 0
        }
        var finish = this.end()
        val text = this.origin.asString()
        if (text.length < finish) {
            finish = text.length
        }
        return text.substring(begin, finish)
    }
}
