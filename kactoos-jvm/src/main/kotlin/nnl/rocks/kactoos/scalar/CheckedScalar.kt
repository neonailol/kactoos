package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.UncheckedFunc
import nnl.rocks.kactoos.text.FormattedText
import nnl.rocks.kactoos.text.UncheckedText

/**
 * Scalar that wraps an original checked exception thrown by the origin using the given wrapping function.
 *
 * There is no thread-safety guarantee.
 *
 * @param T Type of result.
 * @param E Type of exception.
 * @param origin Original scalar.
 * @param func Function that wraps exception.
 * @since 0.4
 */
class CheckedScalar<T : Any, E : Exception>(
    private val origin: KScalar<T>,
    private val func: KFunc<Exception, E>
) : Scalar<T> {

    override fun invoke(): T {
        try {
            return origin()
        } catch (ex: RuntimeException) {
            throw ex
        } catch (ex: InterruptedException) {
            Thread.currentThread().interrupt()
            throw wrappedException(ex)
        } catch (ex: Exception) {
            throw wrappedException(ex)
        }
    }

    /**
     * Wraps exception.
     * Skips unnecessary wrapping of exceptions of the same type.
     * Allows wrapping of exceptions of the same type if the error message
     * has been changed.
     *
     * @param exp Exception
     * @return E Wrapped exception
     */
    private fun wrappedException(exp: Exception): E {
        var wrapped = UncheckedFunc(func).apply(exp)
        val level = InheritanceLevel(
            exp.javaClass, wrapped.javaClass
        ).invoke()
        val message = wrapped.message?.replaceFirst(
                UncheckedText(
                    FormattedText(
                        "%s: ",
                        exp.javaClass.name
                    )
                ).asString().toRegex(), ""
            )
        if (level >= 0 && message == exp.message) {
            wrapped = exp as E
        }
        return wrapped
    }
}
