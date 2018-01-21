package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiProc
import nnl.rocks.kactoos.scalar.True

import java.io.IOException

/**
 * BiProc that doesn't throw checked [Exception], but throws [IOException] instead.
 *
 * There is no thread-safety guarantee.
 *
 * @param proc Encapsulated func
 * @param X Type of input
 * @param Y Type of input
 * @since 0.22
 */
class IoCheckedBiProc<in X : Any, in Y : Any>(private val proc: BiProc<X, Y>) : BiProc<X, Y> {

    @Throws(IOException::class)
    override fun exec(
        first: X,
        second: Y
    ) {
        IoCheckedBiFunc(BiFuncOf(this.proc, True())).apply(first, second)
    }
}
