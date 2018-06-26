package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.Proc

/**
 * Represents many possible inputs as [Func].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input.
 * @param Y Type of output.
 * @param func Func.
 * @since 0.4
 */
class FuncOf<in X : Any, out Y : Any>(
    private val func: KFunc<X, Y>
) : Func<X, Y> {

    constructor(
        proc: Proc<X>,
        result: Y
    ) : this(
        {
            proc.exec(it)
            result
        }
    )

    override fun apply(input: X): Y = func(input)

    companion object {
        operator fun <Y : Any> invoke(
            result: Y
        ) = FuncOf { _: Any -> result }
    }
}
