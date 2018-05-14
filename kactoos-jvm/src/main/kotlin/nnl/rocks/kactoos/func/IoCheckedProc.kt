package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Proc
import nnl.rocks.kactoos.scalar.True

/**
 * Proc that doesn't throw checked [Exception], but throws [java.io.IOException] instead.
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @param proc Encapsulated func
 * @param X Type of input
 * @since 0.4
 */
class IoCheckedProc<in X : Any>(private val proc: Proc<X>) : Proc<X> {

    override fun exec(input: X) {
        IoCheckedFunc(FuncOf(this.proc, True())).apply(input)
    }
}
