package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.scalar.CheckedScalar

/**
 * Func that throws exception of specified type.
 *
 * @param X Type of input
 * @param Y Type of output
 * @param E Exception's type
 * @param origin Original func
 * @param func Function that wraps exceptions.
 * @since 0.5
 */
class CheckedFunc<X : Any, Y : Any, E : Exception>(
    private val origin: KFunc<X, Y>,
    private val func: KFunc<Exception, E>
) : Func<X, Y> {

    override fun apply(input: X): Y {
        return CheckedScalar(
            { origin.invoke(input) },
            func
        ).invoke()
    }
}
