package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text

/**
 * Swaps the case of a Text changing upper and title case to lower case, and lower case to upper case.
 *
 * @since 0.4
 */
class SwappedCaseText(
    origin: KText
) : TextEnvelope(
    {
        val text = origin()
        val chars = CharArray(text.length) { i: Int ->
            val char = text[i]
            when (char) {
                char.toUpperCase() -> char.toLowerCase()
                char.toLowerCase() -> char.toUpperCase()
                else ->char
            }
        }
        String(chars)
    }
) {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )
}
