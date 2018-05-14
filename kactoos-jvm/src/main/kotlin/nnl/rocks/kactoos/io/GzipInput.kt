package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import java.io.InputStream
import java.util.zip.GZIPInputStream

/**
 * Input that reads compressed data from the GZIP file format.
 *
 * @param origin The input
 * @param size Max length of the buffer
 * @since 0.3
 */
class GzipInput(
    private val origin: Input,
    private val size: Int
) : Input {

    constructor(origin: Input) : this(origin, 16 shl 10)

    override fun stream(): InputStream {
        return GZIPInputStream(
            this.origin.stream(),
            this.size
        )
    }
}
