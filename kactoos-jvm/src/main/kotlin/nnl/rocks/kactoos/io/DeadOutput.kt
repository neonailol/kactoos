package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output

import java.io.OutputStream

/**
 * Output that accepts anything.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class DeadOutput : Output {

    override fun stream(): OutputStream = DeadOutputStream()
}
