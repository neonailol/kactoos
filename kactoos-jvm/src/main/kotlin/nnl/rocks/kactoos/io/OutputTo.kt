package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.KOutput
import nnl.rocks.kactoos.Output
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.io.Writer
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.file.Path

/**
 * An [Output] that encapsulates other destination for the data.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.12
 */
class OutputTo constructor(
    private val origin: Output
) : Output {

    /**
     * @param out KOutput
     * @since 0.15
     */
    constructor(out: KOutput) : this(
        object : Output {
            override fun stream(): OutputStream = out()
        }
    )

    /**
     * @param file The file
     * @param mkdirs Should we do mkdirs beforehand?
     * @since 0.15
     */
    constructor(
        file: File,
        mkdirs: Boolean
    ) : this(
        {
            if (mkdirs) {
                file.parentFile.mkdirs()
            }
            FileOutputStream(file)
        }
    )

    constructor(
        file: File
    ) : this(file, true)

    /**
     * Ctor.
     * @param path The path
     * @param mkdirs Should we do mkdirs beforehand?
     * @since 0.15
     */
    constructor(
        path: Path,
        mkdirs: Boolean
    ) : this(
        {
            val file = path.toFile()
            if (mkdirs) {
                file.parentFile.mkdirs()
            }
            FileOutputStream(file)
        }
    )

    constructor(path: Path) : this(path, true)

    /**
     * Ctor.
     * @param writer The writer
     */
    constructor(writer: Writer) : this(WriterAsOutputStream(writer))

    /**
     * Ctor.
     * @param wtr Writer
     * @param charset Charset
     */
    internal constructor(
        wtr: Writer,
        charset: Charset
    ) : this(WriterAsOutputStream(wtr, charset))

    /**
     * Ctor.
     * @param wtr Writer
     * @param charset Charset
     */
    internal constructor(
        wtr: Writer,
        charset: CharSequence
    ) : this(WriterAsOutputStream(wtr, charset))

    /**
     * Ctor.
     * @param wtr Reader
     * @param charset Charset
     * @param size Buffer size
     */
    internal constructor(
        wtr: Writer,
        charset: Charset,
        size: Int
    ) : this(WriterAsOutputStream(wtr, charset, size))

    /**
     * Ctor.
     * @param wtr Reader
     * @param size Buffer size
     * @since 0.13.3
     */
    internal constructor(
        wtr: Writer,
        size: Int
    ) : this(WriterAsOutputStream(wtr, size))

    /**
     * Ctor.
     * @param wtr Reader
     * @param charset Charset
     * @param size Buffer size
     */
    internal constructor(
        wtr: Writer,
        charset: CharSequence,
        size: Int
    ) : this(WriterAsOutputStream(wtr, charset, size))

    /**
     * Ctor.
     * @param wtr Reader
     * @param ddr Charset decoder
     * @param size Buffer size
     */
    internal constructor(
        wtr: Writer,
        ddr: CharsetDecoder,
        size: Int
    ) : this(WriterAsOutputStream(wtr, ddr, size))

    /**
     * Ctor.
     * @param stream The stream
     */
    constructor(stream: OutputStream) : this({ stream })

    @Throws(IOException::class)
    override fun stream(): OutputStream {
        return this.origin.stream()
    }
}
