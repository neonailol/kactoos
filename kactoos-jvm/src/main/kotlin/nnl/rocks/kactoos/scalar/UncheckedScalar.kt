package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Scalar that doesn't throw checked [Exception].
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param T Type of result
 * @param origin Encapsulated origin
 * @since 0.3
 */
class UncheckedScalar<out T : Any>(private val origin: KScalar<T>) : Scalar<T> {

    constructor(scalar: Scalar<T>) : this({ scalar.value() })

    override fun value(): T = try {
        IoCheckedScalar(this.origin).value()
    } catch (ex: IOException) {
        throw UncheckedIOException(ex)
    }
}
