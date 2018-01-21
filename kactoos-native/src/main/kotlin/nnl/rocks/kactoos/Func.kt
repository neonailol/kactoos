package nnl.rocks.kactoos

/**
 * Function.
 *
 * @since 0.2
 */
actual interface Func<in X : Any, out Y : Any> {

    /**
     * Apply it.
     *
     * @param input The argument
     * @return The result of type [Y]
     * @since 0.2
     */
    actual fun apply(input: X): Y
}
