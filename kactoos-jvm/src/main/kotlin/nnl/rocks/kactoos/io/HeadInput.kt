package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import java.io.InputStream

/**
 * Input that only shows the first N bytes of the original input.
 *
 * @param origin The original input.
 * @param length Limit of bytes that can be read from the beginning.
 * @since 0.5
 */
class HeadInput(
    private val origin: Input,
    private val length: Long
) : Input {

    override fun stream(): InputStream = HeadInputStream(origin.stream(), length)
}
