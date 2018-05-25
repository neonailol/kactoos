package nnl.rocks.kactoos.io

import java.io.IOException
import java.io.InputStream

/**
 * Input stream that only shows the first N bytes of the original stream.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The original input stream.
 * @param len A number of bytes that can be read from the beginning.
 * @since 0.5
 */
class HeadInputStream(
    private val origin: InputStream,
    private val length: Long
) : InputStream() {

    /**
     * Current number or read bytes.
     */
    private var processed: Long = 0

    override fun read(): Int {
        val adjusted: Int
        if (processed >= length) {
            adjusted = - 1
        } else {
            processed += 1
            adjusted = origin.read()
        }
        return adjusted
    }

    @Throws(IOException::class)
    override fun skip(skip: Long): Long {
        val adjusted: Long = if (processed + skip > length) {
            length - processed
        } else {
            skip
        }
        val skipped = origin.skip(adjusted)
        processed += skipped
        return skipped
    }

    override fun reset() {
        processed = 0L
        origin.reset()
    }

    override fun available(): Int {
        val available = origin.available()
        val adjusted: Int
        adjusted = if (processed + available > length) {
            (length - processed).toInt()
        } else {
            available
        }
        return adjusted
    }

    override fun close() {
        origin.close()
    }

    override fun markSupported(): Boolean = origin.markSupported()

    override fun mark(readlimit: Int) {
        origin.mark(readlimit)
    }
}
