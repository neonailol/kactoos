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
actual interface Text : Comparable<Text> {

    /**
     * Convert it to the string.
     * @return The string
     * @throws IOException If fails
     * @since 0.2
     */
    @Throws(IOException::class)
    actual fun asString(): String

    override fun compareTo(other: Text): Int = UncheckedText(this).compareTo(other)
}
