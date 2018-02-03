package nnl.rocks.kactoos

import nnl.rocks.kactoos.text.UncheckedText
import java.io.IOException

/**
 * Text.
 *
 * If you don't want to have any checked exceptions being
 * thrown out of your [Text], you can use [UncheckedText] decorator.
 *
 * There is no thread-safety guarantee.
 *
 * @see nnl.rocks.kactoos.text.TextOf
 * @since 0.2
 */
@FunctionalInterface
actual interface Text {

    /**
     * Convert it to the string.
     * @return The string
     * @throws IOException If fails
     * @since 0.2
     */
    @Throws(IOException::class)
    actual fun asString(): String

    class NoNulls(private val origin: Text) : Text {

        @Suppress("USELESS_ELVIS")
        @Throws(IOException::class)
        override fun asString(): String = origin.asString() ?: throw IllegalStateException("NULL instead of a valid result")
    }
}
