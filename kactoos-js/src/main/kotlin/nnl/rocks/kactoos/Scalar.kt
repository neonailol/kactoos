package nnl.rocks.kactoos

/**
 * Scalar.
 *
 * @since 0.2
 */
actual interface Scalar<out T : Any> {

    /**
     * Convert it to the value.
     * @return The value
     * @since 0.2
     */
    actual fun value(): T
}
