package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.dummy

import java.util.concurrent.Callable

/**
 * Func as Runnable.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of input
 * @since 0.12
 */
class RunnableOf<X : Any>(
    private val func: Func<X, X>,
    private val input: X
) : Runnable {

    /**
     * @param proc Encapsulated proc
     * @since 0.11
     */
    constructor(
        proc: Callable<X>,
        input: X
    ) : this(FuncOf(proc), input)

    /**
     * @param proc Encapsulated proc
     */
    constructor(
        proc: Proc<X>,
        input: X
    ) : this(CallableOf(proc, input, input), input)

    constructor(func: Func<X, X>) : this(func, dummy())

    constructor(proc: Proc<X>) : this(proc, dummy())

    constructor(callable: Callable<X>) : this(FuncOf(callable))

    override fun run() {
        UncheckedFunc(this.func).apply(this.input)
    }
}
