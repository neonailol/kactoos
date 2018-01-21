package nnl.rocks.kactoos.io

import java.io.IOException
import java.io.Reader
import java.io.Writer

/**
 * Input to Output copying reader.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 * @since 0.13
 */
class TeeReader(
    private val source: Reader,
    private val destination: Writer
) : Reader() {

    @Throws(IOException::class)
    override fun read(
        cbuf: CharArray,
        offset: Int,
        length: Int
    ): Int {
        val done = this.source.read(cbuf, 0, length)
        if (done >= 0) {
            this.destination.write(cbuf)
        }
        return done
    }

    @Throws(IOException::class)
    override fun close() {
        try {
            this.source.close()
        } finally {
            this.destination.close()
        }
    }
}
