package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.BiProc
import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.Proc
import java.util.concurrent.Callable

/**
 * Represents many possible inputs as [BiFunc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @param func Func
 * @since 0.20
 */
class BiFuncOf<in X : Any, in Y : Any, out Z : Any>(
    private val func: BiFunc<X, Y, Z>
) : BiFunc<X, Y, Z> {

    /**
     * @param fnc The func
     */
    constructor(fnc: KBiFunc<X, Y, Z>) : this(Lambda(fnc))

    /**
     * @param result The result
     */
    constructor(result: Z) : this({ _: X, _: Y -> result })

    /**
     * @param fnc The func
     */
    constructor(fnc: Func<X, Z>) : this({ first: X, _: Y -> fnc.apply(first) })

    /**
     * @param proc The proc
     * @param result Result to return
     */
    constructor(
        proc: Proc<X>,
        result: Z
    ) : this({ first: X, _: Y -> proc.exec(first); result })

    /**
     * @param proc The proc
     * @param result Result to return
     */
    constructor(
        proc: BiProc<X, Y>,
        result: Z
    ) : this({ first: X, second: Y -> proc.exec(first, second); result })

    /**
     * @param callable The callable
     */
    constructor(callable: Callable<Z>) : this({ _: X, _: Y -> callable.call() })

    constructor(proc: Proc<X>) : this(FuncOf(proc))

    constructor(runnable: Runnable) : this(FuncOf(runnable))

    /**
     * @param runnable The runnable
     */
    constructor(
        runnable: Runnable,
        input: X,
        result: Z
    ) : this(CallableOf<X, Z>(runnable, input, result))

    /**
     * Apply it.
     * @param first The first argument
     * @param second The second argument
     * @return The result [Z]
     * @throws Exception If fails
     */
    @Throws(Exception::class)
    override fun apply(
        first: X,
        second: Y
    ): Z = func.apply(first, second)

    private class Lambda<in X : Any, in Y : Any, out Z : Any>(
        private val func: KBiFunc<X, Y, Z>
    ) : BiFunc<X, Y, Z> {

        /**
         * Apply it.
         * @param first The first argument
         * @param second The second argument
         * @return The result of type [Z]
         * @throws Exception If fails
         */
        @Throws(Exception::class)
        override fun apply(
            first: X,
            second: Y
        ): Z = func(first, second)
    }
}
