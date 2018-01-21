package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.io.BytesOf
import nnl.rocks.kactoos.io.InputOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import nnl.rocks.kactoos.scalar.ScalarOf
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * TextOf
 *
 * @param origin The Scalar of String
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.12
 */
class TextOf private constructor(private val origin: Scalar<String>) : Text {

    /**
     * @param input The Input
     */
    constructor(input: Input) : this(BytesOf(input))

    /**
     * @param url The URL
     * @since 0.16
     */
    constructor(url: URL) : this(InputOf(url))

    /**
     * @param uri The URI
     * @since 0.16
     */
    constructor(uri: URI) : this(InputOf(uri))

    /**
     * @param path The Input
     * @since 0.13
     */
    constructor(path: Path) : this(InputOf(path))

    /**
     * @param file The Input
     * @since 0.13
     */
    constructor(file: File) : this(InputOf(file))

    constructor(input: InputStream) : this(InputOf(InputStreamReader(input)))

    /**
     * @param input The Input
     * @param cset The Charset
     */
    constructor(
        input: Input,
        cset: Charset
    ) : this(BytesOf(input), cset)

    /**
     * @param input The Input
     * @param cset The Charset
     */
    constructor(
        input: Input,
        cset: String
    ) : this(BytesOf(input), cset)

    /**
     * @param input The input
     * @param max Max length of the buffer for reading
     * @param cset The Charset
     */
    constructor(
        input: Input,
        max: Int,
        cset: Charset
    ) : this(BytesOf(input, max), cset)

    constructor(
        input: Input,
        max: Int
    ) : this(BytesOf(input, max), StandardCharsets.UTF_8)

    /**
     * @param rdr Reader
     */
    constructor(rdr: Reader) : this(BytesOf(rdr))

    /**
     * @param rdr Reader
     * @param cset Charset
     */
    constructor(
        rdr: Reader,
        cset: Charset
    ) : this(BytesOf(rdr, cset))

    /**
     * @param rdr Reader
     * @param cset Charset
     * @param max Buffer size
     */
    constructor(
        rdr: Reader,
        cset: Charset,
        max: Int
    ) : this(BytesOf(rdr, cset, max))

    /**
     * @param builder The String builder
     */
    constructor(builder: CharSequence) : this(BytesOf(builder))

    /**
     * @param builder The String builder
     * @param cset The Charset
     */
    constructor(
        builder: CharSequence,
        cset: Charset
    ) : this(BytesOf(builder, cset), cset)

    /**
     * @param chars The chars
     */
    constructor(vararg chars: Char) : this(BytesOf(chars, StandardCharsets.UTF_8))

    /**
     * @param chars The chars
     * @param cset The charset
     */
    constructor(
        chars: CharArray,
        cset: Charset
    ) : this(BytesOf(chars, cset))

    /**
     * @param error The exception to serialize
     */
    constructor(error: Throwable) : this(BytesOf(error))

    /**
     * @param bytes The array of bytes
     */
    constructor(vararg bytes: Byte) : this(BytesOf { bytes })

    /**
     * @param bytes The Bytes
     * @param cset The Charset
     */
    constructor(
        bytes: Bytes,
        cset: Charset
    ) : this(String(bytes.asBytes(), cset))

    constructor(
        bytes: Bytes
    ) : this(String(bytes.asBytes(), StandardCharsets.UTF_8))

    /**
     * @param bytes The Bytes
     * @param cset The Charset
     */
    constructor(
        bytes: Bytes,
        cset: String
    ) : this(String(bytes.asBytes(), Charset.forName(cset)))

    /**
     * @param input The String
     * @param cset The Charset
     */
    constructor(
        input: String,
        cset: Charset
    ) : this(ScalarOf { String(input.toByteArray(cset), cset) })

    constructor(
        input: String
    ) : this(input, StandardCharsets.UTF_8)

    /**
     * @param iterable The iterable to convert to string
     * @since 0.21
     */
    constructor(iterable: Iterable<Any>) : this(
        JoinedText(
            ", ",
            Mapped(
                fnc = FuncOf { it.toString() },
                src = iterable
            )
        ).asString()
    )

    @Throws(IOException::class)
    override fun asString(): String = IoCheckedScalar(this.origin).value()

    override fun compareTo(other: Text): Int = UncheckedText(this).compareTo(other)

    override fun toString(): String = UncheckedText(this).asString()
}
