package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import java.io.IOException
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
    private val size: Int = 16 shl 10
) : Input {

    @Throws(IOException::class)
    override fun stream(): InputStream {
        return GZIPInputStream(
            this.origin.stream(),
            this.size
        )
    }
}
