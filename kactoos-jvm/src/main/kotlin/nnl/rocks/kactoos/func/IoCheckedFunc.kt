package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import java.io.IOException

/**
 * Func that doesn't throw checked [Exception], but throws [IOException] instead.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param func Encapsulated func
 * @param X Type of input
 * @param Y Type of output
 * @since 0.4
 */
class IoCheckedFunc<in X : Any, out Y : Any>(private val func: KFunc<X, Y>) : Func<X, Y> {

    @Throws(IOException::class)
    override fun apply(input: X): Y = IoCheckedScalar({ this.func.invoke(input) }).value()
}
