package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output

import java.io.OutputStream
import java.io.Writer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder

/**
 * Writer as [Output].
 *
 * This class is for internal use only. Use [OutputTo] instead.
 *
 * There is no thread-safety guarantee.
 *
 * @param writer Reader
 * @param decoder Decoder
 * @param size Buffer size
 * @since 0.3
 */
internal class WriterAsOutput(
    private val writer: Writer,
    private val decoder: CharsetDecoder,
    private val size: Int
) : Output {

    /**
     * Ctor.
     * @param wtr Reader
     * @param cset Charset
     * @param max Buffer size
     */
    constructor(
        wtr: Writer,
        cset: Charset = Charsets.UTF_8,
        max: Int = 16 shl 10
    ) : this(wtr, cset.newDecoder(), max)

    override fun stream(): OutputStream {
        return WriterAsOutputStream(this.writer, this.decoder, this.size)
    }
}
