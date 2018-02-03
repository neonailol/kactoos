package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import java.io.IOException

/**
 * Repeat an text count times.
 *
 * @param origin The Text
 * @param count How many times repeat the Text
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.9
 */
class RepeatedText(
    private val origin: Text,
    private val count: Int
) : Text {

    /**
     * Ctor.
     * @param text A String
     * @param count How many times repeat the Text
     */
    constructor(
        text: String,
        count: Int
    ) : this(TextOf(text), count)

    @Throws(IOException::class)
    override fun asString(): String = with(StringBuilder()) {
        for (cnt in 0 until count) {
            append(origin.asString())
        }
        toString()
    }
}
