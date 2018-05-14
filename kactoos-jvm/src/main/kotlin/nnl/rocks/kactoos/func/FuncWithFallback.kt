package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func

/**
 * Func with a fallback plan.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of input
 * @param Y Type of output
 * @param func The func
 * @param fallback The fallback
 * @param follow The follow up func
 * @since 0.2
 */
class FuncWithFallback<in X : Any, out Y : Any>(
    private val func: Func<X, Y>,
    private val fallback: Func<Throwable, Y>,
    private val follow: Func<Y, Y>
) : Func<X, Y> {

    constructor(
        func: Func<X, Y>,
        fallback: Func<Throwable, Y>
    ) : this(func, fallback, FuncOf { input -> input })

    @Suppress("TooGenericExceptionCaught")
    override fun apply(input: X): Y {
        val result: Y = try {
            this.func.apply(input)
        } catch (ex: InterruptedException) {
            Thread.currentThread().interrupt()
            this.fallback.apply(ex)
        } catch (ex: Throwable) {
            this.fallback.apply(ex)
        }
        return this.follow.apply(result)
    }
}
