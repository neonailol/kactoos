package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.SolidFunc

/**
 * Cached and synchronized version of a KScalar.
 *
 * Objects of this class are thread safe.
 *
 * @param T Type of result
 * @param func Cached func
 * @since 0.4
 * @see StickyScalar
 * @see SyncScalar
 */
class SolidScalar<out T : Any>(
    private val func: Func<Boolean, T>
) : Scalar<T> {

    constructor(scalar: KScalar<T>) : this(SolidFunc(FuncOf { _ -> scalar() }))

    override fun invoke(): T = func.apply(true)
}
