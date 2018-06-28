package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text

/**
 * Swaps the case of a Text changing upper and title case to lower case, and lower case to upper case.
 *
 * @since 0.4
 */
class SwappedCaseText private constructor(origin: KScalar<String>): TextEnvelope(origin) {

    constructor(origin: Text) : this(
        {
            val text = origin.asString()
            val chars = text.toCharArray()
            var idx = 0
            while (idx < chars.size) {
                val chr = chars[idx]
                if (chr.isUpperCase()) {
                    chars[idx] = chr.toLowerCase()
                } else if (chr.isLowerCase()) {
                    chars[idx] = chr.toUpperCase()
                }
                idx += 1
            }
            String(chars)
        }
    )
}
