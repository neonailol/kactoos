package nnl.rocks.kactoos

/**
 * Procedure.
 *
 * If you don't want to have any checked exceptions being thrown
 * out of your [Proc], you can use [nnl.rocks.kactoos.func.UncheckedProc]
 * decorator. Also you may try [nnl.rocks.kactoos.func.IoCheckedProc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @see nnl.rocks.kactoos.func.ProcOf
 *
 * @since 0.2
 */
@FunctionalInterface
actual interface Proc<in X : Any> {

    /**
     * Execute it.
     * @param input The argument
     * @throws Exception If fails
     * @since 0.2
     */
    @Throws(Exception::class)
    actual fun exec(input: X)

    class NoNulls<in X : Any>(private val origin: Proc<X>) : Proc<X> {

        @Throws(Exception::class)
        override fun exec(input: X) = this.origin.exec(input)
    }
}
