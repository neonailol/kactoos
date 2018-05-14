package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import java.io.IOException

/**
 * Scalar that doesn't throw checked [Exception], but throws
 * [IOException] instead.
 *
 * There is no thread-safety guarantee.
 *
 * This class implements [Scalar], which throws a checked
 * [Exception]. This may not be convenient in many cases. To make
 * it more convenient and get rid of the checked exception you can
 * use [UncheckedScalar] or [IoCheckedScalar] decorators.
 *
 *
 *
 * @param T Type of result
 * @param origin Encapsulated scalar
 * @since 0.4
 */
class IoCheckedScalar<out T : Any>(private val origin: Scalar<T>) : Scalar<T> {

    @Throws(IOException::class)
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
