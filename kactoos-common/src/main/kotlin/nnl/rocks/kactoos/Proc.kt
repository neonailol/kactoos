package nnl.rocks.kactoos

/**
 * Procedure.
 *
 * @param X Type of input
 * @since 0.2
 */
interface Proc<in X : Any> {

    /**
     * Execute it.
     * @param input The argument
     * @since 0.2
     */
    fun exec(input: X)
}
