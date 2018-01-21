package nnl.rocks.kactoos

/**
 * Function that accepts two arguments.
 *
 * @since 0.2
 */
actual interface BiFunc<in X : Any, in Y : Any, out Z : Any> {

    /**
     * Apply it.
     *
     * @param first The first argument
     * @param second The second argument
     * @return The result [Z]
     * @since 0.2
     */
    actual fun apply(
        first: X,
        second: Y
    ): Z
}
