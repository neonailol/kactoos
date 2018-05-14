package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.scalar.Constant
import java.io.InputStream

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
class UncheckedInput(private val input: Input) : Input {

    override fun stream(): InputStream = Constant { this.input.stream() }.invoke()
}
