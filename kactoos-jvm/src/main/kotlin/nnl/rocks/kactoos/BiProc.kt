package nnl.rocks.kactoos

/**
 * Proc that accepts two arguments.
 *
 * If you don't want to have any checked exceptions being thrown
 * out of your [BiProc], you can use
 * [nnl.rocks.kactoos.func.UncheckedBiProc] decorator. Also
 * you may try [nnl.rocks.kactoos.func.IoCheckedBiProc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @since 0.20
 */
@FunctionalInterface
interface BiProc<in X : Any, in Y : Any> {

    /**
     * Execute it.
     * @param first The first argument
     * @param second The second argument
     * @throws Exception If fails
     */
    @Throws(Exception::class)
    fun exec(
        first: X,
        second: Y
    )
}

internal typealias KBiProc<X, Y> = (X, Y) -> Unit
