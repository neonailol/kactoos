package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import java.util.Locale

/**
 * Text in lower case.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.1
 */
class LowerText private constructor(origin: KScalar<String>) : TextEnvelope(origin) {

    /**
     * @param origin The text
     * @param locale Locale
     */
    constructor(origin: Text, locale: Locale) : this(
        {
            origin.asString().toLowerCase(locale)
        }
    )

    constructor(origin: Text) : this(origin, Locale.ENGLISH)
}
