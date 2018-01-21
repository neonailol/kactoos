package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiProc

/**
 * BiProc that doesn't throw checked [Exception].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of input
 * @param Y Type of input
 * @since 0.22
 */
class UncheckedBiProc<in X : Any, in Y : Any>(private val proc: BiProc<X, Y>) : BiProc<X, Y> {

    override fun exec(
        first: X,
        second: Y
    ) {
        UncheckedBiFunc(BiFuncOf(this.proc, true)).apply(first, second)
    }
}
