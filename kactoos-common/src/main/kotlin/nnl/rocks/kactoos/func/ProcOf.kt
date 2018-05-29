package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.KProc
import nnl.rocks.kactoos.Proc

/**
 * Func as Proc.
 *
 * There is no thread-safety guarantee.
 *
 * @param X Type of input
 * @param proc The proc
 * @since 0.4
 */
class ProcOf<in X : Any>(private val proc: KProc<X>) : Proc<X> {

    constructor(fnc: Func<X, *>) : this({ fnc.apply(it) })

    override fun exec(input: X) = proc(input)
}
