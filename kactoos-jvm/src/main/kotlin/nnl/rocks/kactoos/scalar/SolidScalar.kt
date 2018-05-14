package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.SolidFunc

/**
 * Cached and synchronized version of a Scalar.
 *
 * Objects of this class are thread safe.
 *
 *
 *
 * @param T Type of result
 * @param func Cached func
 * @see StickyScalar
 * @see SyncScalar
 * @since 0.24
 */
class SolidScalar<out T : Any>(private val func: Func<Boolean, T>) : Scalar<T> {

    constructor(scalar: Scalar<T>) : this(SolidFunc(FuncOf { _ -> scalar() }))

    @Throws(Exception::class)
    override fun value(): T = this.func.apply(true)
}
