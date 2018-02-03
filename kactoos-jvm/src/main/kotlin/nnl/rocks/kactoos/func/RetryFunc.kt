package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc

/**
 * Func that will try a few times before throwing an exception.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param func Func original
 * @param exit Exit condition, returns TRUE if there is no more reason to try
 * @param X Type of input
 * @param Y Type of output
 * @since 0.8
 */
class RetryFunc<X : Any, Y : Any>(
    private val func: Func<X, Y>,
    private val exit: Func<Int, Boolean>
) : Func<X, Y> {

    /**
     * @param proc Func original
     * @since 0.12
     */
    constructor(
        proc: Proc<X>,
        result: Y
    ) : this(FuncOf { input -> proc.exec(input); result })

    /**
     * @param proc Func original
     * @param attempts Maximum number of attempts
     * @since 0.12
     */
    constructor(
        proc: Proc<X>,
        result: Y,
        attempts: Int
    ) : this(FuncOf { input -> proc.exec(input); result }, attempts)

    /**
     * @param proc Func original
     * @param ext Exit condition, returns TRUE if there is no more reason to try
     * @since 0.12
     */
    constructor(
        proc: Proc<X>,
        result: Y,
        ext: Func<Int, Boolean>
    ) : this(FuncOf { input -> proc.exec(input); result }, ext)

    /**
     * @param fnc Func original
     * @param attempts Maximum number of attempts
     */
    constructor(
        fnc: Func<X, Y>,
        attempts: Int
    ) : this(fnc, FuncOf { attempt -> attempt >= attempts })

    constructor(func: Func<X, Y>) : this(func, 3)

    constructor(proc: Proc<X>) : this(FuncOf(proc))

    constructor(
        proc: Proc<X>,
        attempts: Int
    ) : this(FuncOf(proc), attempts)

    constructor(
        proc: Proc<X>,
        func: Func<Int, Boolean>
    ) : this(FuncOf(proc), func)

    @Throws(Exception::class)
    @Suppress("TooGenericExceptionCaught")
    override fun apply(input: X): Y {
        var attempt = 0
        var error: Exception = IllegalArgumentException(
            "An immediate exit, didn't have a chance to try at least once"
        )
        while (! this.exit.apply(attempt)) {
            try {
                return this.func.apply(input)
            } catch (ex: InterruptedException) {
                Thread.currentThread().interrupt()
                error = ex
                break
                // @checkstyle IllegalCatchCheck (1 line)
            } catch (ex: Exception) {
                error = ex
            }

            ++ attempt
        }
        throw error
    }
}
