package nnl.rocks.kactoos

/**
 * Proc that accepts two arguments.
 *
 * @since 0.2
 */
expect interface BiProc<in X : Any, in Y : Any> {

    /**
     * Execute it.
     * @param first The first argument
     * @param second The second argument
     * @since 0.2
     */
    fun exec(
        first: X,
        second: Y
    )
}
