package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Repeat an text count times.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class RepeatedText private constructor(text: KScalar<String>) : TextEnvelope(text) {

    /**
     * @param origin The Text
     * @param count How many times repeat the Text
     */
    constructor(origin: Text, count: Int) : this(
        {
            with(StringBuilder()) {
                for (cnt in 0 until count) {
                    append(origin.asString())
                }
            }.toString()
        }
    )

    /**
     * Ctor.
     * @param text A String
     * @param count How many times repeat the Text
     */
    constructor(
        text: String,
        count: Int
    ) : this(TextOf(text), count)

}
