package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.StickyFunc

/**
 * Cached version of a Scalar.
 *
 * This [Scalar] decorator technically is an in-memory
 * cache.
 *
 * Pay attention that this class is not thread-safe. It is highly
 * recommended to always decorate it with [SyncScalar].
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 * @param T Type of result
 * @param func Cached func
 * @see StickyFunc
 * @since 0.3
 */
class StickyScalar<T : Any>(private val func: Func<Boolean, T>) : Scalar<T> {

    constructor(scalar: KScalar<T>) : this(StickyFunc(FuncOf { input -> scalar.invoke() }))

    @Throws(Exception::class)
    override fun value(): T = this.func.apply(true)
}
