package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.KProc
import nnl.rocks.kactoos.Proc
import java.io.IOException

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
class IoCheckedProc<in X : Any>(private val proc: KProc<X>) : Proc<X> {

    @Throws(IOException::class)
    override fun exec(input: X) {
        IoCheckedFunc({ _: Any -> this.proc }).apply(input)
    }
}
