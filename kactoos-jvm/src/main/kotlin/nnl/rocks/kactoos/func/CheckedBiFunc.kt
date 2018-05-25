package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.scalar.CheckedScalar

/**
 * BiFunc that throws exception of specified type.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @param E Exception's type
 * @since 0.5
 */
class CheckedBiFunc<X : Any, Y : Any, Z : Any, E : Exception>(
    private val origin: KBiFunc<X, Y, Z>,
    private val func: KFunc<Exception, E>
) : BiFunc<X, Y, Z> {

    override fun apply(first: X, second: Y): Z {
        return CheckedScalar(
            { origin.invoke(first, second) },
            func
        ).invoke()
    }
}
