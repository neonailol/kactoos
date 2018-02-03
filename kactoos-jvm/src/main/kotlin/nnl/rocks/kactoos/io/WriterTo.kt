package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.io.File
import java.io.IOException
import java.io.OutputStream
import java.io.OutputStreamWriter
import java.io.Writer
import java.nio.charset.Charset
import java.nio.charset.CharsetEncoder
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * A [Writer] that encapsulates other destination for the data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.13
 */
class WriterTo(
    private val target: UncheckedScalar<Writer>
) : Writer() {

    constructor(tgt: Scalar<Writer>) : this(UncheckedScalar(StickyScalar(tgt)))

    /**
     * @param path The path
     */
    constructor(path: Path) : this(OutputTo(path))

    /**
     * @param file The file
     */
    constructor(file: File) : this(OutputTo(file))

    /**
     * @param stream The output
     */
    constructor(stream: OutputStream) : this(OutputTo(stream))

    /**
     * @param output The input
     * @param charset The charset
     */
    constructor(
        output: Output,
        charset: Charset = StandardCharsets.UTF_8
    ) : this(
        ScalarOf { OutputStreamWriter(output.stream(), charset) }
    )

    /**
     * @param output The input
     * @param charset The charset
     */
    constructor(
        output: Output,
        charset: CharSequence
    ) : this(ScalarOf { OutputStreamWriter(output.stream(), charset.toString()) })

    /**
     * @param output The input
     * @param encoder Charset encoder
     * @since 0.13.1
     */
    constructor(
        output: Output,
        encoder: CharsetEncoder
    ) : this(ScalarOf { OutputStreamWriter(output.stream(), encoder) })

    @Throws(IOException::class)
    override fun write(
        cbuf: CharArray,
        off: Int,
        len: Int
    ) {
        this.target.value().write(cbuf, off, len)
    }

    @Throws(IOException::class)
    override fun flush() {
        this.target.value().flush()
    }

    @Throws(IOException::class)
    override fun close() {
        this.target.value().close()
    }
}
