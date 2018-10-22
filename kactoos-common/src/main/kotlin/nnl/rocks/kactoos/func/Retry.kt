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
 * @since 0.4
 */
class Retry<X : Any, Y : Any>(
    private val func: Func<X, Y>,
    private val exit: Func<Int, Boolean>
) : Func<X, Y> {

    /**
     * @param proc Func original
     * @since 0.4
     */
    constructor(
        proc: Proc<X>,
        result: Y
    ) : this(FuncOf { input -> proc.exec(input); result })

    /**
     * @param proc Func original
     * @param attempts Maximum number of attempts
     * @since 0.4
     */
    constructor(
        proc: Proc<X>,
        result: Y,
        attempts: Int
    ) : this(FuncOf { input -> proc.exec(input); result }, attempts)

    /**
     * @param proc Func original
     * @param ext Exit condition, returns TRUE if there is no more reason to try
     * @since 0.4
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

    override fun apply(input: X): Y {
        var attempt = 0
        var error: Exception = IllegalArgumentException(
            "An immediate exit, didn't have a chance to try at least once"
        )
        while (! exit.apply(attempt)) {
            try {
                return func.apply(input)
            } catch (ex: Exception) {
                error = ex
            }

            ++ attempt
        }
        throw error
    }
}
