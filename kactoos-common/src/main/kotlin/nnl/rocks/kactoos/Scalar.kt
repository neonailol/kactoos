package nnl.rocks.kactoos

/**
 * Scalar.
 *
 * @param T Type of value
 * @since 0.2
 */
interface Scalar<out T : Any> {

    /**
     * Get value of this [Scalar]
     * @return The value
     * @since 0.2
     */
    operator fun invoke(): T
}
