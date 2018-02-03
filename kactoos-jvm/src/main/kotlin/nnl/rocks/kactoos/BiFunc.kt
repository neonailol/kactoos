package nnl.rocks.kactoos

/**
 * Function that accepts two arguments.
 *
 * If you don't want to have any checked exceptions being thrown
 * out of your [BiFunc], you can use
 * [nnl.rocks.kactoos.func.UncheckedBiFunc] decorator. Also
 * you may try [nnl.rocks.kactoos.func.IoCheckedBiFunc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @since 0.2
 */
@FunctionalInterface
actual interface BiFunc<in X : Any, in Y : Any, out Z : Any> {

    /**
     * Apply it.
     * @param first The first argument
     * @param second The second argument
     * @return The result [Z]
     * @throws Exception If fails
     * @since 0.2
     */
    @Throws(Exception::class)
    actual fun apply(
        first: X,
        second: Y
    ): Z

    class NoNulls<in X : Any, in Y : Any, out Z : Any>(private val origin: BiFunc<X, Y, Z>) : BiFunc<X, Y, Z> {

        @Throws(Exception::class)
        override fun apply(
            first: X,
            second: Y
        ): Z = origin.apply(first, second)
    }
}
