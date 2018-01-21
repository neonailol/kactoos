package nnl.rocks.kactoos.io

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream

/**
 * InputStream that returns content in small portions.
 *
 * @param origin Original stream to encapsulate and make slower
 * @since 0.12
 */
class SlowInputStream(
    private val origin: InputStream
) : InputStream() {

    /**
     * @param size The size of the array to encapsulate
     */
    constructor(size: Int) : this(ByteArrayInputStream(ByteArray(size)))

    @Throws(IOException::class)
    override fun read(): Int = with(ByteArray(1)) {
        return when {
            read(this) < 0 -> - 1
            else -> this[0].toInt()
        }
    }

    @Throws(IOException::class)
    override fun read(
        buf: ByteArray,
        offset: Int,
        len: Int
    ): Int = when {
        len > 1 -> origin.read(buf, offset, len - 1)
        else -> origin.read(buf, offset, len)
    }

    @Throws(IOException::class)
    override fun read(buf: ByteArray): Int = this.read(buf, 0, buf.size)
}
