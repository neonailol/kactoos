package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.Reduced
import java.io.InputStream
import java.io.SequenceInputStream

/**
 * Concatenation of several inputs.
 *
 * @since 0.4
 */
class Joined(
    private val inputs: Iterable<Input>
) : Input {

    override fun stream(): InputStream {
        return Reduced(
            { left, right -> SequenceInputStream(left, right) },
            Mapped(
                { input: Input -> { input.stream() } },
                inputs
            )
        ).invoke()
    }
}
