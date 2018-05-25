package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.KProc
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.scalar.CheckedScalar

/**
 * Proc that throws exception of specified type.
 *
 * @param X Type of input
 * @param E Exception's type
 * @param origin Original proc
 * @param func Function that wraps exceptions.
 * @since 0.5
 */
class CheckedProc<X : Any, E : Exception>(
    private val origin: KProc<X>,
    private val func: KFunc<Exception, E>
) : Proc<X> {

    override fun exec(input: X) {
        CheckedScalar(
            {
                origin.invoke(input)
                true
            },
            func
        ).invoke()
    }
}
