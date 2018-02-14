package nnl.rocks.kactoos

import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

/**
 * Scalar.
 *
 * If you don't want to have any checked exceptions being
 * thrown out of your [Scalar], you can use [UncheckedScalar]
 * decorator. Also you may try [IoCheckedScalar].
 *
 * If you want to cache the result of the [Scalar] and make
 * sure it doesn't calculate anything twice, you can use [StickyScalar] decorator.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of value
 * @see StickyScalar
 * @see UncheckedScalar
 * @see IoCheckedScalar
 * @see nnl.rocks.kactoos.scalar.Constant
 * @since 0.2
 */
@FunctionalInterface
actual interface Scalar<out T : Any> {

    /**
     * Convert it to the value.
     * @return The value
     * @throws Exception If fails
     * @since 0.2
     */
    @Throws(Exception::class)
    actual fun value(): T

    class NoNulls<out T : Any>(private val origin: Scalar<T>) : Scalar<T> {

        @Suppress("USELESS_ELVIS")
        @Throws(Exception::class)
        override fun value(): T = origin.value() ?: throw IllegalStateException("NULL instead of a valid result")
    }
}
