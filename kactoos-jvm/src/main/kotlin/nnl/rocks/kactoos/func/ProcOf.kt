package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KProc
import nnl.rocks.kactoos.Proc
import java.util.concurrent.Callable

/**
 * Func as Proc.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param proc The proc
 * @since 0.12
 */
class ProcOf<in X : Any>(private val proc: Proc<X>) : Proc<X> by proc {

    /**
     * @param runnable The runnable
     */
    constructor(runnable: Runnable) : this({ runnable.run() })

    /**
     * @param callable The callable
     */
    constructor(callable: Callable<X>) : this({ callable.call() })

    /**
     * @param fnc The func
     */
    constructor(fnc: Func<X, *>) : this({ fnc.apply(it) })

    /**
     * @param proc The proc
     */
    constructor(proc: KProc<X>) : this(Lambda(proc))

    private class Lambda<in X : Any>(
        private val func: KProc<X>
    ) : Proc<X> {

        /**
         * Execute it.
         * @param input The argument
         * @throws Exception If fails
         */
        override fun exec(input: X) = func(input)
    }
}
