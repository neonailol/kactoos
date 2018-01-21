package nnl.rocks.kactoos

/**
 * Procedure.
 *
 * @param X Type of input
 * @since 0.2
 */
expect interface Proc<in X : Any> {

    /**
     * Execute it.
     *
     * @param input The argument
     */
    fun exec(input: X)
}
