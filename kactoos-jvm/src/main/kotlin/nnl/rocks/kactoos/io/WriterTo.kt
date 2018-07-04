package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Output
import java.io.File
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
    private val target: KScalar<Writer>
) : Writer() {

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
        { OutputStreamWriter(output.stream(), charset) }
    )

    /**
     * @param output The input
     * @param charset The charset
     */
    constructor(
        output: Output,
        charset: CharSequence
    ) : this({ OutputStreamWriter(output.stream(), charset.toString()) })

    /**
     * @param output The input
     * @param encoder Charset encoder
     * @since 0.13.1
     */
    constructor(
        output: Output,
        encoder: CharsetEncoder
    ) : this({ OutputStreamWriter(output.stream(), encoder) })

    override fun write(
        cbuf: CharArray,
        off: Int,
        len: Int
    ) {
        this.target().write(cbuf, off, len)
    }

    override fun flush() {
        this.target().flush()
    }

    override fun close() {
        this.target().close()
    }
}
