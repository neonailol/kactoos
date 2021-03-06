package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc

/**
 * BiFunc that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @since 0.4
 */
class UncheckedBiFunc<in X : Any, in Y : Any, out Z : Any>(private val func: BiFunc<X, Y, Z>) : BiFunc<X, Y, Z> {

    override fun apply(first: X, second: Y): Z = func.apply(first, second)
}
