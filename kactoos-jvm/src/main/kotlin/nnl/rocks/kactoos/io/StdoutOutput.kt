package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output

import java.io.OutputStream

/**
 * Output that writes to `stdout`.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.6
 */
class StdoutOutput : Output {

    override fun stream(): OutputStream = System.out
}
