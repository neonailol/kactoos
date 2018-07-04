package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.BiFunc
import nnl.rocks.kactoos.BiProc
import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KBiFunc
import nnl.rocks.kactoos.Proc

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
     * @param proc The proc
     * @param result Result to return
     */
    constructor(
        proc: BiProc<X, Y>,
        result: Z
    ) : this({ first: X, second: Y -> proc.exec(first, second); result })

    override fun apply(
        first: X,
        second: Y
    ): Z = func(first, second)

    companion object {

        operator fun <Z : Any> invoke(
            result: Z
        ): BiFuncOf<Any, Any, Z> = BiFuncOf({ _: Any, _: Any -> result })

        operator fun <X : Any, Z : Any> invoke(
            fnc: Func<X, Z>
        ): BiFuncOf<X, Any, Z> = BiFuncOf({ first: X, _: Any -> fnc.apply(first) })

        operator fun <X : Any, Z : Any> invoke(
            proc: Proc<X>,
            result: Z
        ): BiFuncOf<X, Any, Z> = BiFuncOf({ first: X, _: Any -> proc.exec(first); result })
    }
}
