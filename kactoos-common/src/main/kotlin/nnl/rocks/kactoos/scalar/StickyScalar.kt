package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.StickyFunc

/**
 * Cached version of a KScalar.
 *
 * This [KScalar] decorator technically is an in-memory cache.
 *
 * Pay attention that this class is not thread-safe. It is highly
 * recommended to always decorate it with [SyncScalar].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of result
 * @param func Cached func
 * @see StickyFunc
 * @since 0.3
 */
class StickyScalar<T : Any> private constructor(private val func: Func<Boolean, T>) : Scalar<T> {

    constructor(scalar: KScalar<T>) : this(StickyFunc(FuncOf { _ -> scalar() }))

    override fun invoke(): T = func.apply(true)
}
