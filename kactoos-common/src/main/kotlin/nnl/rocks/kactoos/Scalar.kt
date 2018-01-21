package nnl.rocks.kactoos

/**
 * Scalar.
 * @since 0.2
 */
expect interface Scalar<out T : Any> {

    /**
     * Convert it to the value.
     * @return The value
     */
    fun value(): T
}


