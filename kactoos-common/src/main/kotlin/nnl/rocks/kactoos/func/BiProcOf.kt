package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiProc
import nnl.rocks.kactoos.KBiProc

/**
 * Func as BiProc.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param proc The proc
 * @since 0.4
 */
class BiProcOf<in X : Any, in Y : Any>(
    private val proc: KBiProc<X, Y>
) : BiProc<X, Y> {

    override fun exec(
        first: X,
        second: Y
    ) {
        proc(first, second)
    }
}
