package nnl.rocks.kactoos

/**
 * Text.
 *
 * @since 0.2
 */
actual interface Text : Comparable<Text> {

    /**
     * Convert it to the string.
     *
     * @return The string
     */
    actual fun asString(): String
}
