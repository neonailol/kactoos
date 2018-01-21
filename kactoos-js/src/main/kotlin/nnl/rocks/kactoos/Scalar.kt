package nnl.rocks.kactoos

/**
 * Scalar.
 * @since 0.2
 */
actual interface Scalar<out T : Any> {

    /**
     * Convert it to the value.
     * @return The value
     */
    actual fun value(): T
}
