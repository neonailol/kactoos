package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import java.io.IOException

/**
 * Func that doesn't throw checked [Exception], but throws [IOException] instead.
 *
 * There is no thread-safety guarantee.
 *
 * @param func Encapsulated func
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @since 0.13
 */
class IoCheckedBiFunc<in X : Any, in Y : Any, out Z : Any>(
    private val func: BiFunc<X, Y, Z>
) : BiFunc<X, Y, Z> {

    override fun apply(
        first: X,
        second: Y
    ): Z = IoCheckedScalar(Constant { this.func.apply(first, second) }).invoke()
}
