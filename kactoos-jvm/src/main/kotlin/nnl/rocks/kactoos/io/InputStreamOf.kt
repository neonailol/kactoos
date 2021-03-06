package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import java.io.File
import java.io.InputStream
import java.io.Reader
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.file.Path

/**
 * An [InputStream] that encapsulates other sources of data.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class InputStreamOf(
    private val source: KScalar<InputStream>
) : InputStream() {

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
    constructor(
        text: Text,
        charset: Charset = Charsets.UTF_8
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
    constructor(
        rdr: Reader,
        charset: Charset = Charsets.UTF_8
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
    ) : this(InputOf(rdr, Charsets.UTF_8, max))

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
    constructor(input: Input) : this({ input.stream() })

    override fun read(): Int {
        return this.source().read()
    }

    override fun read(buffer: ByteArray): Int {
        return this.source().read(buffer)
    }

    override fun read(
        buffer: ByteArray,
        offset: Int,
        length: Int
    ): Int {
        return this.source().read(buffer, offset, length)
    }

    override fun close() {
        this.source().close()
    }

    override fun skip(num: Long): Long {
        return this.source().skip(num)
    }

    override fun available(): Int {
        return this.source().available()
    }

    override fun mark(limit: Int) {
        this.source().mark(limit)
    }

    override fun reset() {
        this.source().reset()
    }

    override fun markSupported(): Boolean {
        return this.source().markSupported()
    }
}
