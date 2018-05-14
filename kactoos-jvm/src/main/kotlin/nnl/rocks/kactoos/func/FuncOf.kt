package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.Proc
import java.util.concurrent.Callable

/**
 * Represents many possible inputs as [Func].
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of output
 * @param func Func
 * @since 0.12
 */
class FuncOf<in X : Any, out Y : Any>(
    private val func: KFunc<X, Y>
) : Func<X, Y> {

    /**
     * @param result The result
     */
    constructor(result: Y) : this({ result })

    /**
     * @param callable The callable
     */
    constructor(callable: Callable<Y>) : this({ callable.call() })

    /**
     * @param proc The proc
     * @param result Result to return
     */
    constructor(
        proc: Proc<X>,
        result: Y
    ) : this({ proc.exec(it); result })

    override fun apply(input: X): Y = this.func(input)
}
