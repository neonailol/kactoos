package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.ThreadFactory

/**
 * Func that runs in the background.
 *
 * If you want your piece of code to be executed in the background, use [AsyncFunc] as following:
 *
 * ```
 * int length = new AsyncFunc(
 *   input -> input.length()
 * ).invoke("Hello, world!").get();
 * ```
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param Y Type of output
 * @param func The func
 * @param executor Executor Service
 * @since 0.10
 */
class AsyncFunc<X : Any, Y : Any> constructor(
    private val func: Func<X, Y>,
    private val executor: ExecutorService
) : Func<X, Future<Y>>, Proc<X> {

    /**
     * @param proc The proc
     * @param fct Factory
     */
    constructor(
        proc: Proc<X>,
        result: Y,
        fct: ThreadFactory
    ) : this(FuncOf(proc, result), fct)

    /**
     * @param fnc The func
     * @param fct Factory
     */
    constructor(
        fnc: Func<X, Y>,
        fct: ThreadFactory
    ) : this(fnc, Executors.newSingleThreadExecutor(fct))

    constructor(fnc: Func<X, Y>) : this(fnc, Executors.defaultThreadFactory())

    override fun apply(input: X): Future<Y> = executor.submit<Y> { func.apply(input) }

    override fun exec(input: X) {
        this.apply(input)
    }
}
