package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output
import nnl.rocks.kactoos.scalar.Constant
import java.io.OutputStream

/**
 * Input that doesn't throw checked [Exception].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.9
 */
class UncheckedOutput(
    private val output: Output
) : Output {

    override fun stream(): OutputStream = Constant { this.output.stream() }.invoke()
}
