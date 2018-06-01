package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.*

/**
 * Represents many possible inputs as [BiFunc].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of input
 * @param Z Type of output
 * @param func Func
 * @since 0.4
 */
class BiFuncOf<in X : Any, in Y : Any, out Z : Any>(
    private val func: KBiFunc<X, Y, Z>
) : BiFunc<X, Y, Z> {

    /**
     * @param fnc The func
     */
    constructor(fnc: BiFunc<X, Y, Z>) : this({ first, second -> fnc.apply(first, second) })

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
     * Apply it.
     * @param first The first argument
     * @param second The second argument
     * @return The result [Z]
     * @throws Exception If fails
     */
    override fun apply(
        first: X,
        second: Y
    ): Z = func(first, second)
}
