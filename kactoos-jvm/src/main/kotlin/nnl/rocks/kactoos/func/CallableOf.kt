package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Proc
import java.util.concurrent.Callable

/**
 * Func as [Callable].
 *
 * You may want to use this decorator where
 * [Callable] is required, but you just have a function:
 *
 *  ```
 *  Callable<String> callable = new CallableOf<>(i -> "Hello, world!");
 *  ```
 *
 * There is no thread-safety guarantee.
 *
 * @param func Encapsulated func
 * @param input Input
 * @param X Type of input
 * @param T Type of output
 * @since 0.12
 */
class CallableOf<X : Any, T : Any>(
    private val func: Func<X, T>,
    private val input: X
) : Callable<T> {

    /**
     * @param runnable Encapsulated runnable
     * @since 0.12
     */
    constructor(
        runnable: Runnable,
        input: X,
        result: T
    ) : this(FuncOf { runnable.run(); result }, input)

    /**
     * @param proc Encapsulated proc
     * @since 0.12
     */
    constructor(
        proc: Proc<X>,
        input: X,
        result: T
    ) : this(FuncOf { it -> proc.exec(it); result }, input)

    override fun call(): T = this.func.apply(this.input)
}
