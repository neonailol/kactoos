package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

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

    override fun asString(): String = StringBuilder(this.origin.asString()).reverse().toString()
}
