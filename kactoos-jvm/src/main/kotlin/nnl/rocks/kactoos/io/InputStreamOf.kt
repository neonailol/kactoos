package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.StickyScalar
import nnl.rocks.kactoos.scalar.UncheckedScalar
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.Reader
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * An [InputStream] that encapsulates other sources of data.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class InputStreamOf private constructor(src: Scalar<InputStream>) : InputStream() {

    /**
     * The source.
     */
    private val source: UncheckedScalar<InputStream> = UncheckedScalar(StickyScalar(src))

    /**
     * Ctor.
     * @param path The path
     */
    constructor(path: Path) : this(InputOf(path))

    /**
     * Ctor.
     * @param file The file
     */
    constructor(file: File) : this(InputOf(file))

    /**
     * Ctor.
     * @param url The URL
     */
    constructor(url: URL) : this(InputOf(url))

    /**
     * Ctor.
     * @param uri The URI
     */
    constructor(uri: URI) : this(InputOf(uri))

    /**
     * Ctor.
     * @param bytes The text
     */
    constructor(bytes: Bytes) : this(InputOf(bytes))

    /**
     * Ctor.
     * @param bytes The text
     */
    constructor(bytes: ByteArray) : this(InputOf(bytes))

    /**
     * Ctor.
     * @param text The text
     * @param charset Charset
     */
    @JvmOverloads constructor(
        text: Text,
        charset: Charset = StandardCharsets.UTF_8
    ) : this(InputOf(text, charset))

    /**
     * Ctor.
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: Text,
        charset: CharSequence
    ) : this(InputOf(text, charset))

    /**
     * Ctor.
     * @param text The text
     */
    constructor(text: CharSequence) : this(InputOf(text))

    /**
     * Ctor.
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: CharSequence,
        charset: Charset
    ) : this(InputOf(text, charset))

    /**
     * Ctor.
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: CharSequence,
        charset: CharSequence
    ) : this(InputOf(text, charset))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     * @since 0.13.2
     */
    @JvmOverloads constructor(
        rdr: Reader,
        charset: Charset = StandardCharsets.UTF_8
    ) : this(InputOf(rdr, charset))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     * @since 0.13.2
     */
    constructor(
        rdr: Reader,
        charset: CharSequence
    ) : this(InputOf(rdr, charset))

    /**
     * Ctor.
     * @param rdr Reader
     * @param cset Charset
     * @param max Buffer size
     * @since 0.13.2
     */
    constructor(
        rdr: Reader,
        cset: Charset,
        max: Int
    ) : this(InputOf(rdr, cset, max))

    /**
     * Ctor.
     * @param rdr Reader
     * @param max Buffer size
     * @since 0.13.2
     */
    constructor(
        rdr: Reader,
        max: Int
    ) : this(InputOf(rdr, StandardCharsets.UTF_8, max))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     * @param max Buffer size
     * @since 0.13.2
     */
    constructor(
        rdr: Reader,
        charset: CharSequence,
        max: Int
    ) : this(InputOf(rdr, charset, max))

    /**
     * Ctor.
     * @param input The input
     */
    constructor(input: Input) : this(ScalarOf<InputStream> { input.stream() } as Scalar<InputStream>)

    @Throws(IOException::class)
    override fun read(): Int {
        return this.source.value().read()
    }

    @Throws(IOException::class)
    override fun read(buffer: ByteArray): Int {
        return this.source.value().read(buffer)
    }

    @Throws(IOException::class)
    override fun read(
        buffer: ByteArray,
        offset: Int,
        length: Int
    ): Int {
        return this.source.value().read(buffer, offset, length)
    }

    @Throws(IOException::class)
    override fun close() {
        this.source.value().close()
    }

    @Throws(IOException::class)
    override fun skip(num: Long): Long {
        return this.source.value().skip(num)
    }

    @Throws(IOException::class)
    override fun available(): Int {
        return this.source.value().available()
    }

    override fun mark(limit: Int) {
        this.source.value().mark(limit)
    }

    @Throws(IOException::class)
    override fun reset() {
        this.source.value().reset()
    }

    override fun markSupported(): Boolean {
        return this.source.value().markSupported()
    }
}
