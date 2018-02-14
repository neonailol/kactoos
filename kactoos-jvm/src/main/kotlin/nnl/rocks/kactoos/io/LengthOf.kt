package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.NumberEnvelope

/**
 * Length of [Input].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class LengthOf(
    input: Input,
    max: Int
) : NumberEnvelope(
    Constant {
        input.stream().use { stream ->
            val buf = ByteArray(max)
            var length = 0L
            while (true) {
                val len = stream.read(buf)
                if (len > 0) {
                    length += len.toLong()
                }
                if (len < 0) {
                    break
                }
            }
            length.toDouble()
        }
    }
) {

    /**
     * @param input The input
     */
    constructor(input: Input) : this(input, 16 shl 10)
}
