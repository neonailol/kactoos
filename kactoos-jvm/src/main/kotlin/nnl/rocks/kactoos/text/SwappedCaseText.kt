package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text

/**
 * Swaps the case of a Text changing upper and title case to lower case,
 * and lower case to upper case.
 *
 * @param origin The text
 *
 *
 *
 * @since 0.13.3
 */
class SwappedCaseText(private val origin: Text) : Text {

    override fun asString(): String {
        val text = this.origin.asString()
        val chars = text.toCharArray()
        var idx = 0
        while (idx < chars.size) {
            val chr = chars[idx]
            if (Character.isUpperCase(chr)) {
                chars[idx] = Character.toLowerCase(chr)
            } else if (Character.isLowerCase(chr)) {
                chars[idx] = Character.toUpperCase(chr)
            }
            idx += 1
        }
        return String(chars)
    }
}
