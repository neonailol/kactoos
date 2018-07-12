package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.KText

/**
 * Abbreviates a Text using ellipses.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class AbbreviatedText(
    origin: KText,
    width: Int
) : TextEnvelope(
    {
        when {
            origin().length <= width -> origin()
            else -> SubText(
                origin,
                0,
                width - ELLIPSES_WIDTH
            ).asString() + "..."
        }
    }
) {

    constructor(
        text: String
    ) : this(
        { text },
        MAX_WIDTH
    )

    constructor(
        text: String,
        max: Int
    ) : this(
        { text },
        max
    )

    companion object {

        /**
         * The default max line width.
         */
        private const val MAX_WIDTH = 80

        /**
         * The ellipses width.
         */
        private const val ELLIPSES_WIDTH = 3
    }
}
