package nnl.rocks.kactoos

/**
 * Function that accepts two arguments.
 *
 * @since 0.2
 */
expect interface BiFunc<in X : Any, in Y : Any, out Z : Any> {

    /**
     * Apply it.
     * @param first The first argument
     * @param second The second argument
     * @return The result [Z]
     * @throws Exception If fails
     * @since 0.2
     */
    fun apply(
        first: X,
        second: Y
    ): Z
}
