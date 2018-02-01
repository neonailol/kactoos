
package nnl.rocks.kactoos.io

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream

/**
 * InputStream that returns content in small portions.
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: ddd4d4de21d7e043cadf15782b6d6c5f8d044522 $
 * @since 0.12
 */
internal class SlowInputStream
/**
 * Ctor.
 * @param stream Original stream to encapsulate and make slower
 */
(
        /**
         * Original stream.
         */
        private val origin: InputStream
) : InputStream() {

    /**
     * Ctor.
     * @param size The size of the array to encapsulate
     */
    constructor(size: Int) : this(ByteArrayInputStream(ByteArray(size)))

    @Throws(IOException::class)
    override fun read(): Int {
        val buf = ByteArray(1)
        val result: Int
        if (this.read(buf) < 0) {
            result = - 1
        } else {
            result = buf[0].toInt()
        }
        return result
    }

    @Throws(IOException::class)
    override fun read(
            buf: ByteArray,
            offset: Int,
            len: Int
    ): Int {
        val result: Int
        if (len > 1) {
            result = this.origin.read(buf, offset, len - 1)
        } else {
            result = this.origin.read(buf, offset, len)
        }
        return result
    }

    @Throws(IOException::class)
    override fun read(buf: ByteArray): Int {
        return this.read(buf, 0, buf.size)
    }
}
