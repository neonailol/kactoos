package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.io.BytesOf
import nnl.rocks.kactoos.io.InputOf
import nnl.rocks.kactoos.iterable.Mapped
import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.scalar.IoCheckedScalar
import java.io.*
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * TextOf
 *
 * There is no thread-safety guarantee.
 *
 * @param origin The Scalar of String
 * @since 0.3
 */
class TextOf private constructor(private val origin: Scalar<String>) : Text {

    /**
     * Ctor.
     *
     * @param input The Input
     */
    constructor(input: Input) : this(BytesOf(input))

    /**
     * Ctor.
     * @param url The URL
     * @since 0.16
     */
    constructor(url: URL) : this(InputOf(url))

    /**
     * Ctor.
     * @param uri The URI
     * @since 0.16
     */
    constructor(uri: URI) : this(InputOf(uri))

    /**
     * Ctor.
     * @param path The Input
     * @since 0.13
     */
    constructor(path: Path) : this(InputOf(path))

    /**
     * Ctor.
     * @param file The Input
     * @since 0.13
     */
    constructor(file: File) : this(InputOf(file))

    /**
     * Ctor.
     *
     * @param input The Input
     * @param cset The Charset
     */
    constructor(
        input: Input,
        cset: Charset
    ) : this(BytesOf(input), cset)

    /**
     * Ctor.
     *
     * @param input The Input
     * @param cset The Charset
     */
    constructor(
        input: Input,
        cset: String
    ) : this(BytesOf(input), cset)

    /**
     * Ctor.
     *
     * @param input The input
     * @param max Max length of the buffer for reading
     * @param cset The Charset
     */
    @JvmOverloads constructor(
        input: Input,
        max: Int,
        cset: Charset = StandardCharsets.UTF_8
    ) : this(BytesOf(input, max), cset)

    /**
     * Ctor.
     *
     * @param rdr Reader
     */
    constructor(rdr: Reader) : this(BytesOf(rdr))

    /**
     * Ctor.
     * @param rdr Reader
     * @param cset Charset
     */
    constructor(
        rdr: Reader,
        cset: Charset
    ) : this(BytesOf(rdr, cset))

    /**
     * Ctor.
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
     * Ctor.
     *
     * @param builder The String builder
     */
    constructor(builder: CharSequence) : this(BytesOf(builder))

    /**
     * Ctor.
     *
     * @param builder The String builder
     * @param cset The Charset
     */
    constructor(
        builder: CharSequence,
        cset: Charset
    ) : this(BytesOf(builder, cset), cset)

    /**
     * Ctor.
     *
     * @param chars The chars
     */
    constructor(vararg chars: Char) : this(BytesOf(*chars))

    /**
     * Ctor.
     *
     * @param chars The chars
     * @param cset The charset
     */
    constructor(
        chars: CharArray,
        cset: Charset
    ) : this(BytesOf(chars, cset))

    /**
     * Ctor.
     * @param error The exception to serialize
     */
    constructor(error: Throwable) : this(BytesOf(error))

    /**
     * Ctor.
     * @param error The exception to serialize
     * @param charset Charset
     * @since 0.29
     */
    constructor(
        error: Throwable,
        charset: Charset
    ) : this(BytesOf(error, charset))

    /**
     * Ctor.
     * @param error The exception to serialize
     * @param charset Charset
     * @since 0.29
     */
    constructor(
        error: Throwable,
        charset: CharSequence
    ) : this(BytesOf(error, charset))

    /**
     * Ctor.
     * @param strace The stacktrace to serialize
     * @since 0.29
     */
    constructor(vararg strace: StackTraceElement) : this(BytesOf(*strace))

    /**
     * Ctor.
     * @param strace The stacktrace to serialize
     * @param charset Charset
     * @since 0.29
     */
    constructor(
        strace: Array<StackTraceElement>,
        charset: Charset
    ) : this(BytesOf(strace, charset))

    /**
     * Ctor.
     * @param strace The stacktrace to serialize
     * @param charset Charset
     * @since 0.29
     */
    constructor(
        strace: Array<StackTraceElement>,
        charset: CharSequence
    ) : this(BytesOf(strace, charset))

    /**
     * Ctor.
     *
     * @param bytes The array of bytes
     */
    constructor(vararg bytes: Byte) : this(BytesOf(*bytes))

    /**
     * Ctor.
     *
     * @param bytes The Bytes
     * @param cset The Charset
     */
    @JvmOverloads constructor(
        bytes: Bytes,
        cset: Charset = StandardCharsets.UTF_8
    ) : this(Constant { String(bytes.asBytes(), cset) })

    /**
     * Ctor.
     *
     * @param bytes The Bytes
     * @param cset The Charset
     */
    constructor(
        bytes: Bytes,
        cset: String
    ) : this(Constant { String(bytes.asBytes(), Charset.forName(cset)) })

    /**
     * Ctor.
     *
     * @param input The String
     * @param cset The Charset
     */
    @JvmOverloads constructor(
        input: String,
        cset: Charset = StandardCharsets.UTF_8
    ) : this(Constant { String(input.toByteArray(cset), cset) })

    /**
     * Ctor.
     * @param iterable The iterable to convert to string
     * @since 0.21
     */
    constructor(iterable: Iterable<Any>) : this(
        Constant {
            JoinedText(
                ", ",
                Mapped<Any, String>(
                    fnc = FuncOf { it.toString() },
                    iter = iterable
                )
            ).asString()
        }
    )

    /**
     * Ctor.
     * @param input The InputStream where the text is read from
     * @since 0.21
     */
    constructor(input: InputStream) : this(InputOf(InputStreamReader(input)))

    @Throws(IOException::class)
    override fun asString(): String {
        return IoCheckedScalar(this.origin).invoke()
    }

    override fun toString(): String {
        return UncheckedText(this).asString()
    }
}
