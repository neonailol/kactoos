package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.scalar.True

/**
 * Proc that doesn't throw checked [Exception].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param X Type of input
 * @since 0.2
 */
class UncheckedProc<in X : Any>(private val proc: Proc<X>) : Proc<X> {

    override fun exec(input: X) {
        UncheckedFunc(FuncOf(proc, True())).apply(input)
    }
}
