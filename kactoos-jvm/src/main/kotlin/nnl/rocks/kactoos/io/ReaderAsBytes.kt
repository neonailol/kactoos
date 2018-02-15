package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes

import java.io.IOException
import java.io.Reader
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

/**
 * Reader as [Bytes].
 *
 * This class is for internal use only. Use [BytesOf] instead.
 *
 * There is no thread-safety guarantee.
 *
 * @param reader Reader
 * @param charset Charset
 * @param size Buffer size
 * @since 0.3
 */
class ReaderAsBytes @JvmOverloads constructor(
    private val reader: Reader,
    private val charset: CharSequence,
    private val size: Int = 16 shl 10
) : Bytes {

    /**
     * Ctor.
     *
     * @param rdr Reader
     * @param cset Charset
     * @param max Buffer size
     */
    @JvmOverloads constructor(
        rdr: Reader,
        cset: Charset = StandardCharsets.UTF_8,
        max: Int = 16 shl 10
    ) : this(rdr, cset.name(), max)

    /**
     * Ctor.
     * @param rdr Reader
     * @param max Buffer size
     * @since 0.13.3
     */
    constructor(
        rdr: Reader,
        max: Int
    ) : this(rdr, StandardCharsets.UTF_8, max)

    @Throws(IOException::class)
    override fun asBytes(): ByteArray {
        val buffer = CharArray(this.size)
        val builder = StringBuilder(this.size)
        while (true) {
            val done = this.reader.read(buffer, 0, buffer.size)
            if (done < 0) {
                break
            }
            builder.append(buffer, 0, done)
        }
        this.reader.close()
        return builder.toString().toByteArray(charset(this.charset.toString()))
    }
}
