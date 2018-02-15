package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output
import java.io.IOException
import java.io.OutputStream
import java.util.zip.GZIPOutputStream

/**
 * Output that writes compressed data in the GZIP file format.
 *
 * @param origin The output
 * @param size Max length of the buffer
 * @since 0.3
 */
class GzipOutput(
    private val origin: Output,
    private val size: Int
) : Output {

    constructor(origin: Output) : this(origin, 16 shl 10)

    @Throws(IOException::class)
    override fun stream(): OutputStream {
        return GZIPOutputStream(
            this.origin.stream(),
            this.size
        )
    }
}
