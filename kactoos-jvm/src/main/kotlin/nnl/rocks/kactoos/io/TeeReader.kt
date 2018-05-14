package nnl.rocks.kactoos.io

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

    override fun close() {
        try {
            this.source.close()
        } finally {
            this.destination.close()
        }
    }
}
