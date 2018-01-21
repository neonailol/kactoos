package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.io.IOException

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
    private val start: UncheckedScalar<Int>,
    private val end: UncheckedScalar<Int>
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
    ) : this(text, ScalarOf { strt }, ScalarOf { text.asString().length })

    /**
     * @param text The Text
     * @param strt Start position in the text
     * @param finish End position in the text
     */
    constructor(
        text: Text,
        strt: Int,
        finish: Int
    ) : this(text, ScalarOf { strt }, ScalarOf { finish })

    /**
     * @param text The Text
     * @param strt Start position in the text
     * @param finish End position in the text
     */
    constructor(
        text: Text,
        strt: Scalar<Int>,
        finish: Scalar<Int>
    ) : this(text, UncheckedScalar<Int>(strt), UncheckedScalar<Int>(finish))

    @Throws(IOException::class)
    override fun asString(): String {
        var begin = this.start.value()
        if (begin < 0) {
            begin = 0
        }
        var finish = this.end.value()
        val text = this.origin.asString()
        if (text.length < finish) {
            finish = text.length
        }
        return text.substring(begin, finish)
    }

    override fun compareTo(other: Text): Int = UncheckedText(this).compareTo(other)
}
