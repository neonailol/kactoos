package nnl.rocks.kactoos

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
 *
 * @since 0.1
 */
@FunctionalInterface
interface Func<in X : Any, out Y : Any> {

    /**
     * Apply it.
     * @param input The argument
     * @return The result
     * @throws Exception If fails
     */
    @Throws(Exception::class)
    fun apply(input: X): Y
}

internal typealias KFunc<X, Y> = (X) -> Y
