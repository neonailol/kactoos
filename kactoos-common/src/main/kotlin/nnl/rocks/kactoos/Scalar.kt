package nnl.rocks.kactoos

/**
 * Scalar.
 *
 * @param T Type of value
 * @since 0.2
 */
interface Scalar<out T : Any> {

    /**
     * Convert it to the value.
     * @return The value
     * @since 0.2
     */
    fun value(): T

    /**
     * Same as calling [value] but using overloading `()` operator.
     * @return The value
     * @since 0.2
     */
    operator fun invoke() : T = value()
}
