package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.dummy

/**
 * Func that will try a few times before throwing an exception.
 *
 * There is no thread-safety guarantee.
 *
 * @param func Func original
 * @param exit Exit condition, returns TRUE if there is no more reason to try
 * @param X Type of input
 * @param Y Type of output
 * @since 0.3
 */
class RetryFunc<X : Any, Y : Any>(
    private val func: KFunc<X, Y>,
    private val exit: KFunc<Int, Boolean>
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
    ) : this({ input: X -> proc.exec(input); result }, { input -> ext.apply(input) })

    /**
     * @param fnc Func original
     * @param attempts Maximum number of attempts
     */
    constructor(
        fnc: Func<X, Y>,
        attempts: Int
    ) : this({ input -> fnc.apply(input) }, { attempt: Int -> attempt >= attempts })

    constructor(func: Func<X, Y>) : this(func, 3)

    constructor(proc: Proc<X>) : this(FuncOf(proc))

    constructor(
        proc: Proc<X>,
        attempts: Int
    ) : this(FuncOf(proc), attempts)

    constructor(
        proc: Proc<X>,
        func: Func<Int, Boolean>
    ) : this({ input: X -> proc.exec(input); dummy() }, { input: Int -> func.apply(input) })

    @Throws(Exception::class)
    @Suppress("TooGenericExceptionCaught")
    override fun apply(input: X): Y {
        var attempt = 0
        var error: Exception = IllegalArgumentException(
            "An immediate exit, didn't have a chance to try at least once"
        )
        while (! this.exit.invoke(attempt)) {
            try {
                return this.func.invoke(input)
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
