package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output

import java.io.OutputStream
import java.io.Writer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.charset.StandardCharsets

/**
 * Writer as [Output].
 *
 *
 * This class is for internal use only. Use [OutputTo] instead.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.13
 */
internal class WriterAsOutput(
    private val writer: Writer,
    private val decoder: CharsetDecoder,
    private val size: Int
) : Output {

    /**
     * @param wtr Reader
     * @param cset Charset
     * @param max Buffer size
     */
    constructor(
        wtr: Writer,
        cset: Charset = StandardCharsets.UTF_8,
        max: Int = 16 shl 10
    ) : this(
        wtr, cset.newDecoder(), max
    )

    override fun stream(): OutputStream = WriterAsOutputStream(this.writer, this.decoder, this.size)
}
