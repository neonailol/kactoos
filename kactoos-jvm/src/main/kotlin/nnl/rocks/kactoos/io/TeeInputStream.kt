package nnl.rocks.kactoos.io

import java.io.InputStream
import java.io.OutputStream

/**
 * Stream that copies input to output.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class TeeInputStream(
    private val input: InputStream,
    private val output: OutputStream
) : InputStream() {

    override fun read(): Int {
        val data = this.input.read()
        if (data >= 0) {
            this.output.write(data)
        }
        return data
    }

    override fun read(buf: ByteArray): Int {
        return this.read(buf, 0, buf.size)
    }

    override fun read(
        buf: ByteArray,
        offset: Int,
        len: Int
    ): Int {
        val max = this.input.read(buf, offset, len)
        if (max > 0) {
            this.output.write(buf, offset, max)
        }
        return max
    }

    override fun skip(num: Long): Long {
        return this.input.skip(num)
    }

    override fun available(): Int {
        return this.input.available()
    }

    override fun close() {
        this.input.close()
        this.output.close()
    }

    override fun mark(limit: Int) {
        this.input.mark(limit)
    }

    override fun reset() {
        this.input.reset()
    }

    override fun markSupported(): Boolean {
        return this.input.markSupported()
    }
}
