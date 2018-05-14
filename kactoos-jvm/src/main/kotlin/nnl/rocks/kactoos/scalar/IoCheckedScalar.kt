package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import java.io.IOException

/**
 * Scalar that doesn't throw checked [Exception], but throws
 * [IOException] instead.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 *
 * @param T Type of result
 * @param origin Encapsulated scalar
 * @since 0.4
 */
class IoCheckedScalar<out T : Any>(private val origin: Scalar<T>) : Scalar<T> {

    @Suppress("TooGenericExceptionCaught")
    override fun invoke(): T = try {
        this.origin()
    } catch (ex: IOException) {
        throw ex
    } catch (ex: RuntimeException) {
        throw ex
    } catch (ex: InterruptedException) {
        Thread.currentThread().interrupt()
        throw IOException(ex)
    } catch (ex: Exception) {
        throw IOException(ex)
    }
}
