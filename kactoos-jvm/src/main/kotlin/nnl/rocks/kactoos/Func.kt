package nnl.rocks.kactoos

import java.io.IOException

/**
 * Function.
 *
 * If you don't want to have any checked exceptions being thrown
 * out of your [Func], you can use
 * [nnl.rocks.kactoos.func.UncheckedFunc] decorator. Also
 * you may try [nnl.rocks.kactoos.func.IoCheckedFunc].
 *
 * If you want to cache the result of the [Func] and
 * make sure it doesn't calculate anything twice, you can use
 * [nnl.rocks.kactoos.func.StickyFunc] decorator.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of output
 * @see nnl.rocks.kactoos.func.StickyFunc
 * @see nnl.rocks.kactoos.func.UncheckedFunc
 * @see nnl.rocks.kactoos.func.IoCheckedFunc
 * @since 0.2
 */
@FunctionalInterface
actual interface Func<in X : Any, out Y : Any> {

    /**
     * Apply it.
     * @param input The argument
     * @return The result of type [Y]
     * @throws Exception If fails
     * @since 0.2
     */
    @Throws(Exception::class)
    actual fun apply(input: X): Y

    class NoNulls<in X : Any, out Y : Any>(private val func: Func<X, Y>) : Func<X, Y> {

        @Suppress("USELESS_ELVIS")
        @Throws(Exception::class)
        override fun apply(input: X): Y = func.apply(input) ?: throw IOException("NULL instead of a valid result")
    }
}
