package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Scalar that throws unchecked [UncheckedIOException] instead of checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of result
 * @param origin Encapsulated origin
 * @since 0.4
 */
class UncheckedScalar<out T : Any>(private val origin: KScalar<T>) : Scalar<T> {

    constructor(origin: Scalar<T>) : this({ origin() })

    override fun invoke(): T = try {
        IoCheckedScalar(origin).invoke()
    } catch (ex: IOException) {
        throw UncheckedIOException(ex)
    }
}
