package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import java.io.IOException

/**
 * Reverse the Text.
 *
 * @param origin The text
 *
 *
 *
 * @since 0.2
 */
class ReversedText(private val origin: Text) : Text {

    @Throws(IOException::class)
    override fun asString(): String = StringBuilder(this.origin.asString()).reverse().toString()

    override fun compareTo(other: Text): Int = UncheckedText(this).compareTo(other)
}
