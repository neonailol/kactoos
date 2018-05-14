package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func

/**
 * Func that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of input
 * @param Y Type of output
 * @since 0.2
 */
class UncheckedFunc<in X : Any, out Y : Any>(private val func: Func<X, Y>) : Func<X, Y> {

    override fun apply(input: X): Y = this.func.apply(input)
}
