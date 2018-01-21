package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar

import java.io.File
import java.io.IOException
import java.io.OutputStream
import java.io.Writer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * An [OutputStream] that encapsulates other destination for the data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.13
 */
class OutputStreamTo(
    private val target: UncheckedScalar<OutputStream>
) : OutputStream() {

    constructor(tgt: Scalar<OutputStream>) : this(UncheckedScalar(StickyScalar(tgt)))

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

    constructor(wtr: Writer) : this(wtr, StandardCharsets.UTF_8)

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
    constructor(output: Output) : this(ScalarOf<OutputStream> { output.stream() })

    @Throws(IOException::class)
    override fun write(data: Int) {
        this.target.value().write(data)
    }

    @Throws(IOException::class)
    override fun write(buffer: ByteArray) {
        this.target.value().write(buffer)
    }

    @Throws(IOException::class)
    override fun write(
        buffer: ByteArray,
        offset: Int,
        length: Int
    ) {
        this.target.value().write(buffer, offset, length)
    }

    @Throws(IOException::class)
    override fun close() {
        this.target.value().close()
    }

    @Throws(IOException::class)
    override fun flush() {
        this.target.value().flush()
    }
}
