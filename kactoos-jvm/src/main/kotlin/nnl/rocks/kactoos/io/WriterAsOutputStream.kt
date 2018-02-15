package nnl.rocks.kactoos.io

import java.io.IOException
import java.io.OutputStream
import java.io.Writer
import java.nio.ByteBuffer
import java.nio.CharBuffer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.charset.CodingErrorAction
import java.nio.charset.StandardCharsets

/**
 * Writer as [OutputStream].
 *
 *
 * This class is for internal use only. Use [OutputStreamTo]
 * instead.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.13
 */
class WriterAsOutputStream
(
    private val writer: Writer,
    private val decoder: CharsetDecoder,
    size: Int,
    private val input: ByteBuffer = ByteBuffer.allocate(size),
    private val output: CharBuffer = CharBuffer.allocate(size)
) : OutputStream() {

    /**
     * @param wtr Writer
     * @param charset Charset
     */
    constructor(
        wtr: Writer,
        charset: Charset = StandardCharsets.UTF_8
    ) : this(
        wtr, charset.name()
    )

    /**
     * @param wtr Reader
     * @param charset Charset
     * @param size Buffer size
     */
    constructor(
        wtr: Writer,
        charset: CharSequence,
        size: Int = 16 shl 10
    ) : this(wtr, Charset.forName(charset.toString()), size)

    /**
     * @param wtr Reader
     * @param size Buffer size
     * @since 0.13.3
     */
    constructor(
        wtr: Writer,
        size: Int
    ) : this(wtr, StandardCharsets.UTF_8, size)

    /**
     * @param wtr Reader
     * @param charset Charset
     * @param size Buffer size
     */
    constructor(
        wtr: Writer,
        charset: Charset,
        size: Int
    ) : this(
        wtr,
        charset.newDecoder()
            .onMalformedInput(CodingErrorAction.REPORT)
            .onUnmappableCharacter(CodingErrorAction.REPORT),
        size
    )

    override fun close() {
        this.writer.close()
    }

    @Throws(IOException::class)
    override fun write(data: Int) {
        this.write(byteArrayOf(data.toByte()), 0, 1)
    }

    @Throws(IOException::class)
    override fun write(buffer: ByteArray) {
        this.write(buffer, 0, buffer.size)
    }

    @Throws(IOException::class)
    override fun write(
        buffer: ByteArray,
        offset: Int,
        length: Int
    ) {
        var left = length
        var start = offset
        while (left > 0) {
            val taken = this.next(buffer, start, left)
            start += taken
            left -= taken
        }
    }

    /**
     * Write a portion from the buffer.
     * @param buffer The buffer
     * @param offset Offset in the buffer
     * @param length Maximum possible amount to take
     * @return How much was taken
     * @throws IOException If fails
     */
    @Throws(IOException::class)
    private fun next(
        buffer: ByteArray,
        offset: Int,
        length: Int
    ): Int {
        val max = Math.min(length, this.input.remaining())
        this.input.put(buffer, offset, max)
        this.input.flip()
        while (true) {
            val result = this.decoder.decode(
                this.input, this.output, false
            )
            if (result.isError) {
                result.throwException()
            }
            this.writer.write(
                this.output.array(), 0, this.output.position()
            )
            this.writer.flush()
            this.output.rewind()
            if (result.isUnderflow) {
                break
            }
        }
        this.input.compact()
        return max
    }
}
