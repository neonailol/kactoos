package nnl.rocks.kactoos.io

import java.io.ByteArrayInputStream
import java.io.InputStream
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.scalar.MinOf
import nnl.rocks.kactoos.text.FormattedText

/**
 * Input showing only last N bytes of the stream.
 *
 * There is no thread-safety guarantee.
 *
 * @param input Input to decorate
 * @param count Number of last bytes to show from input
 * @param max Maximum number of bytes to read at once
 * @since 0.5
 */
class TailInput(
    private val input: Input,
    private val count: Int,
    private val max: Int = 16384
) : Input {

    override fun stream(): InputStream {
        if (this.max < this.count) {
            throw IllegalArgumentException(
                FormattedText(
                    "Can't tail %d bytes if buffer is set to %d",
                    this.count, this.max
                ).asString()
            )
        }
        val buffer = ByteArray(this.max)
        val response = ByteArray(this.count)
        var num = 0
        val strm = input.stream()
        var read = strm.read(buffer)
        while (read > 0) {
            num = if (read < this.max && read < this.count) {
                copyPartial(buffer, response, num, read)
            } else {
                copy(buffer, response, read)
            }
            read = strm.read(buffer)
        }
        return ByteArrayInputStream(response, 0, num)
    }

    /**
     * Copy full buffer to response.
     * @param buffer The buffer array
     * @param response The response array
     * @param read Number of bytes read in buffer
     * @return Number of bytes in the response buffer
     */
    private fun copy(
        buffer: ByteArray, response: ByteArray,
        read: Int
    ): Int {
        System.arraycopy(
            buffer, read - this.count, response, 0, this.count
        )
        return MinOf(this.count, read).toInt()
    }

    /**
     * Copy buffer to response for read count smaller then buffer size.
     * @param buffer The buffer array
     * @param response The response array
     * @param num Number of bytes in response array from previous read
     * @param read Number of bytes read in the buffer
     * @return New count of bytes in the response array
     * @checkstyle ParameterNumberCheck (3 lines)
     */
    private fun copyPartial(
        buffer: ByteArray, response: ByteArray,
        num: Int, read: Int
    ): Int {
        return if (num > 0) {
            System.arraycopy(
                response, read, response, 0, count - read
            )
            System.arraycopy(buffer, 0, response, count - read, read)
            count
        } else {
            System.arraycopy(buffer, 0, response, 0, read)
            read
        }
    }
}
