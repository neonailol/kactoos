package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiProc
import nnl.rocks.kactoos.KBiProc
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.scalar.CheckedScalar

/**
 * BiProc that throws exception of specified type.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param E Exception's type
 * @param origin Original BiProc
 * @param func Function that wraps exceptions.
 * @since 0.5
 */
class CheckedBiProc<X : Any, Y : Any, E : Exception>(
    private val origin: KBiProc<X, Y>,
    private val func: KFunc<Exception, E>
) : BiProc<X, Y> {

    override fun exec(first: X, second: Y) {
        CheckedScalar(
            {
                origin.invoke(first, second)
                true
            },
            func
        ).invoke()
    }
}
