package nnl.rocks.kactoos

/**
 * Procedure.
 *
 * @param X Type of input
 * @since 0.2
 */
actual interface Proc<in X : Any> {

    /**
     * Execute it.
     *
     * @param input The argument
     */
    actual fun exec(input: X)
}
