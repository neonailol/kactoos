package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Extract a substring from a Text.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.4
 */
class SubText private constructor(text: KScalar<String>): TextEnvelope(text) {

    /**
     * @param origin The Text
     * @param start Start position in the text
     * @param end End position in the text
     */
    constructor(origin: Text, start: KScalar<Int>, end: KScalar<Int>) : this(
        {
            var begin = start()
            if (begin < 0) {
                begin = 0
            }
            var finish = end()
            val text = origin.asString()
            if (text.length < finish) {
                finish = text.length
            }
            text.substring(begin, finish)
        }
    )

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

}
