package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Output
import java.io.File
import java.io.OutputStream
import java.io.Writer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.file.Path

/**
 * An [OutputStream] that encapsulates other destination for the data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.3
 */
class OutputStreamTo(
    private val target: KScalar<OutputStream>
) : OutputStream() {

    /**
     * @param path The path
     */
    constructor(path: Path) : this(OutputTo(path))

    /**
     * @param file The file
     */
    constructor(file: File) : this(OutputTo(file))

    /**
     * @param wtr Writer
     * @param charset Charset
     * @since 0.13.1
     */
    constructor(
        wtr: Writer,
        charset: Charset
    ) : this(OutputTo(wtr, charset))

    constructor(wtr: Writer) : this(wtr, Charsets.UTF_8)

    /**
     * @param wtr Writer
     * @param charset Charset
     * @since 0.13.1
     */
    constructor(
        wtr: Writer,
        charset: CharSequence
    ) : this(OutputTo(wtr, charset))

    /**
     * @param wtr Reader
     * @param charset Charset
     * @param size Buffer size
     * @since 0.13.1
     */
    constructor(
        wtr: Writer,
        charset: Charset,
        size: Int
    ) : this(OutputTo(wtr, charset, size))

    /**
     * @param wtr Reader
     * @param charset Charset
     * @param size Buffer size
     * @since 0.13.1
     */
    constructor(
        wtr: Writer,
        charset: CharSequence,
        size: Int
    ) : this(OutputTo(wtr, charset, size))

    /**
     * @param wtr Reader
     * @param ddr Charset decoder
     * @param size Buffer size
     * @since 0.13.1
     */
    constructor(
        wtr: Writer,
        ddr: CharsetDecoder,
        size: Int
    ) : this(OutputTo(wtr, ddr, size))

    /**
     * @param output The input
     */
    constructor(output: Output) : this({ output.stream() })

    override fun write(data: Int) {
        this.target().write(data)
    }

    override fun write(buffer: ByteArray) {
        this.target().write(buffer)
    }

    override fun write(
        buffer: ByteArray,
        offset: Int,
        length: Int
    ) {
        this.target().write(buffer, offset, length)
    }

    override fun close() {
        this.target().close()
    }

    override fun flush() {
        this.target().flush()
    }
}
