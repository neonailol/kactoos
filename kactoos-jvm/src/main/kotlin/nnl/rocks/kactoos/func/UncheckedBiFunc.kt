package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * BiFunc that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @since 0.13
 */
class UncheckedBiFunc<in X : Any, in Y : Any, out Z : Any>(private val func: BiFunc<X, Y, Z>) : BiFunc<X, Y, Z> {

    override fun apply(
        first: X,
        second: Y
    ): Z = UncheckedScalar(Constant { this.func.apply(first, second) }).value()
}
