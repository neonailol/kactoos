package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.io.Reader
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.file.Path

/**
 * An [Input] that encapsulates other sources of data.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.11.8
 */
class InputOf(private val origin: Input) : Input {

    /**
     * @param file The file
     */
    constructor(file: File) : this(FileInputStream(file))

    /**
     * @param path The path
     */
    constructor(path: Path) : this(FileInputStream(path.toFile()))

    /**
     * @param uri The URI
     */
    constructor(uri: URI) : this({ uri.toURL() })

    /**
     * @param url The URL
     */
    constructor(url: URL) : this({ url })

    /**
     * @param scalar The url
     */
    constructor(scalar: KScalar<URL>) : this(scalar().openStream())

    /**
     * @param rdr Reader
     */
    constructor(rdr: Reader) : this(BytesOf(rdr))

    /**
     * @param rdr Reader
     * @param charset Charset
     */
    constructor(
        rdr: Reader,
        charset: Charset
    ) : this(BytesOf(rdr, charset))

    /**
     * @param rdr Reader
     * @param charset Charset
     */
    constructor(
        rdr: Reader,
        charset: CharSequence
    ) : this(BytesOf(rdr, charset))

    /**
     * @param rdr Reader
     * @param max Buffer size
     * @since 0.13.3
     */
    constructor(
        rdr: Reader,
        max: Int
    ) : this(BytesOf(rdr, max))

    /**
     * @param rdr Reader
     * @param charset Charset
     * @param max Buffer size
     */
    constructor(
        rdr: Reader,
        charset: Charset,
        max: Int
    ) : this(BytesOf(rdr, charset, max))

    /**
     * @param rdr Reader
     * @param charset Charset
     * @param max Buffer size
     */
    constructor(
        rdr: Reader,
        charset: CharSequence,
        max: Int
    ) : this(BytesOf(rdr, charset, max))

    /**
     * @param chars The chars
     */
    constructor(vararg chars: Char) : this(BytesOf(chars, Charsets.UTF_8))

    /**
     * @param chars The chars
     * @param charset The charset
     */
    constructor(
        chars: CharArray,
        charset: Charset
    ) : this(BytesOf(chars, charset))

    /**
     * @param chars The chars
     * @param charset The charset
     */
    constructor(
        chars: CharArray,
        charset: CharSequence
    ) : this(BytesOf(chars, charset))

    /**
     * @param source The string
     */
    constructor(source: CharSequence) : this(BytesOf(source))

    /**
     * @param source The string
     * @param charset The charset
     */
    constructor(
        source: CharSequence,
        charset: Charset
    ) : this(BytesOf(source, charset))

    /**
     * @param source The string
     * @param charset The charset
     */
    constructor(
        source: CharSequence,
        charset: CharSequence
    ) : this(BytesOf(source, charset))

    /**
     * @param text The text
     */
    constructor(text: Text) : this(BytesOf(text))

    /**
     * @param text The text
     * @param charset The charset
     */
    constructor(
        text: Text,
        charset: Charset
    ) : this(BytesOf(text, charset))

    /**
     * @param text The text
     * @param charset The charset
     */
    constructor(
        text: Text,
        charset: CharSequence
    ) : this(BytesOf(text, charset))

    /**
     * @param error The exception to serialize
     */
    constructor(error: Throwable) : this(BytesOf(error))

    /**
     * @param error The exception to serialize
     * @param charset Charset
     */
    constructor(
        error: Throwable,
        charset: Charset
    ) : this(BytesOf(error, charset))

    /**
     * @param error The exception to serialize
     * @param charset Charset
     */
    constructor(
        error: Throwable,
        charset: CharSequence
    ) : this(BytesOf(error, charset))

    /**
     * @param bytes The bytes
     */
    constructor(bytes: ByteArray) : this(BytesOf { bytes })

    /**
     * @param src The bytes
     */
    constructor(src: Bytes) : this(
        IoCheckedScalar<InputStream>(
            { ByteArrayInputStream(src.asBytes()) }
        ).invoke()
    )

    /**
     * @param stream The stream
     */
    constructor(stream: InputStream) : this(
        object : Input {
            override fun stream(): InputStream = stream
        }
    )

    override fun stream(): InputStream {
        return this.origin.stream()
    }
}
