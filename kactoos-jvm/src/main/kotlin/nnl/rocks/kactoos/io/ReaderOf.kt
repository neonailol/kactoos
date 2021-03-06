package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader
import java.io.UnsupportedEncodingException
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.charset.CharsetDecoder
import java.nio.file.Path

/**
 * A [Reader] that encapsulates other sources of data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.3
 */
class ReaderOf(
    private val source: KScalar<Reader>
) : Reader() {

    /**
     * @param chars Chars
     */
    constructor(vararg chars: Char) : this(InputOf(chars, Charsets.UTF_8))

    /**
     * @param chars Chars
     * @param charset Charset
     */
    constructor(
        chars: CharArray,
        charset: Charset
    ) : this(InputOf(chars, charset))

    /**
     * Ctor.
     * @param chars Chars
     * @param charset Charset
     */
    constructor(
        chars: CharArray,
        charset: CharSequence
    ) : this(InputOf(chars, charset))

    /**
     * @param bytes Bytes
     */
    constructor(bytes: ByteArray) : this(InputOf(bytes))

    /**
     * @param bytes Bytes
     * @param charset Charset
     */
    constructor(
        bytes: ByteArray,
        charset: Charset
    ) : this(InputOf(bytes), charset)

    /**
     * @param bytes Bytes
     * @param charset Charset
     */
    constructor(
        bytes: ByteArray,
        charset: CharSequence
    ) : this(InputOf(bytes), charset)

    /**
     * @param path The path
     */
    constructor(path: Path) : this(InputOf(path))

    /**
     * @param file The file
     */
    constructor(file: File) : this(InputOf(file))

    /**
     * @param url The URL
     */
    constructor(url: URL) : this(InputOf(url))

    /**
     * @param uri The URI
     */
    constructor(uri: URI) : this(InputOf(uri))

    /**
     * @param bytes The text
     */
    constructor(bytes: Bytes) : this(InputOf(bytes))

    /**
     * @param text The text
     */
    constructor(text: Text) : this(InputOf(text))

    /**
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: Text,
        charset: Charset
    ) : this(InputOf(text, charset))

    /**
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: Text,
        charset: CharSequence
    ) : this(InputOf(text, charset))

    /**
     * @param text The text
     */
    constructor(text: CharSequence) : this(InputOf(text))

    /**
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: CharSequence,
        charset: Charset
    ) : this(InputOf(text, charset))

    /**
     * @param text The text
     * @param charset Charset
     */
    constructor(
        text: CharSequence,
        charset: CharSequence
    ) : this(InputOf(text, charset))

    /**
     * @param input The input
     * @param charset The charset
     */
    constructor(
        input: Input,
        charset: Charset = Charsets.UTF_8
    ) : this(
        { InputStreamReader(input.stream(), charset) }
    )

    /**
     * @param input The input
     * @param charset The charset
     */
    constructor(
        input: Input,
        charset: CharSequence
    ) : this({ InputStreamReader(input.stream(), charset.toString()) })

    /**
     * @param input The input
     * @param decoder The decoder
     * @since 0.13.1
     */
    constructor(
        input: Input,
        decoder: CharsetDecoder
    ) : this({ InputStreamReader(input.stream(), decoder) })

    /**
     * @param stream The stream
     * @param charset The charset
     */
    constructor(
        stream: InputStream,
        charset: Charset = Charsets.UTF_8
    ) : this(InputStreamReader(stream, charset))

    constructor(
        stream: InputStream
    ) : this(InputStreamReader(stream, Charsets.UTF_8))

    /**
     * @param stream The stream
     * @param charset The charset
     * @throws UnsupportedEncodingException If fails
     */
    constructor(
        stream: InputStream,
        charset: CharSequence
    ) : this(InputStreamReader(stream, charset.toString()))

    /**
     * @param stream The stream
     * @param decoder The charset decoder
     * @since 0.13.1
     */
    constructor(
        stream: InputStream,
        decoder: CharsetDecoder
    ) : this(InputStreamReader(stream, decoder))

    /**
     * @param rdr The reader
     */
    private constructor(rdr: Reader) : this({ rdr })

    override fun read(
        cbuf: CharArray,
        off: Int,
        len: Int
    ): Int {
        return this.source().read(cbuf, off, len)
    }

    override fun close() {
        this.source().close()
    }
}
