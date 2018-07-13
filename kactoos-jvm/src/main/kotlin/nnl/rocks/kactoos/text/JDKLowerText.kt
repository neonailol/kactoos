package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text
import java.util.Locale

/**
 * Text in lower case.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class JDKLowerText(
    origin: KText,
    locale: Locale
) : TextEnvelope(
    {
        origin().toLowerCase(locale)
    }
) {

    constructor(
        origin: Text,
        locale: Locale
    ) : this(
        { origin.asString() },
        locale
    )

    constructor(
        origin: KText
    ) : this(
        origin,
        Locale.ENGLISH
    )

    constructor(
        origin: Text
    ) : this(
        origin,
        Locale.ENGLISH
    )
}
