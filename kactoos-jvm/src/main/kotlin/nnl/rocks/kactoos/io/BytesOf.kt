package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KBytes
import nnl.rocks.kactoos.Text
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.io.Reader
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * A [Bytes] that encapsulates other sources of data.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.3
 */
class BytesOf constructor(private val origin: KBytes) : Bytes {

    constructor(bytes: Bytes) : this({ bytes.asBytes() })

    /**
     * Ctor.
     * @param input The input
     */
    constructor(input: Input) : this(InputAsBytes(input))

    /**
     * Ctor.
     * @param file The input
     * @since 0.13
     */
    constructor(file: File) : this(InputOf(file))

    /**
     * Ctor.
     * @param path The input
     * @since 0.13
     */
    constructor(path: Path) : this(InputOf(path))

    /**
     * Ctor.
     * @param input The input
     * @param max Max length of the buffer for reading
     */
    constructor(
        input: Input,
        max: Int
    ) : this(InputAsBytes(input, max))

    /**
     * Ctor.
     * @param rdr Reader
     */
    constructor(rdr: Reader) : this(ReaderAsBytes(rdr))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     */
    constructor(
        rdr: Reader,
        charset: Charset
    ) : this(ReaderAsBytes(rdr, charset))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     */
    constructor(
        rdr: Reader,
        charset: CharSequence
    ) : this(ReaderAsBytes(rdr, charset))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     * @param max Buffer size
     */
    constructor(
        rdr: Reader,
        charset: Charset,
        max: Int
    ) : this(ReaderAsBytes(rdr, charset, max))

    /**
     * Ctor.
     * @param rdr Reader
     * @param max Buffer size
     * @since 0.13.3
     */
    constructor(
        rdr: Reader,
        max: Int
    ) : this(ReaderAsBytes(rdr, max))

    /**
     * Ctor.
     * @param rdr Reader
     * @param charset Charset
     * @param max Buffer size
     */
    constructor(
        rdr: Reader,
        charset: CharSequence,
        max: Int
    ) : this(ReaderAsBytes(rdr, charset, max))

    /**
     * Ctor.
     *
     * @param input The source
     * @param charset The charset
     */
    constructor(
        input: CharSequence,
        charset: Charset = StandardCharsets.UTF_8
    ) : this({ input.toString().toByteArray(charset) })

    /**
     * Ctor.
     *
     * @param input The source
     * @param charset The charset
     */
    constructor(
        input: CharSequence,
        charset: CharSequence
    ) : this({ input.toString().toByteArray(charset(charset.toString())) })

    /**
     * Ctor.
     *
     * @param chars The chars
     */
    constructor(vararg chars: Char) : this(chars, StandardCharsets.UTF_8)

    /**
     * Ctor.
     *
     * @param chars The chars
     * @param charset The charset
     */
    constructor(
        chars: CharArray,
        charset: Charset
    ) : this(String(chars), charset)

    /**
     * Ctor.
     *
     * @param chars The chars
     * @param charset The charset
     */
    constructor(
        chars: CharArray,
        charset: CharSequence
    ) : this(String(chars), charset)

    /**
     * Ctor.
     * @param text The source
     * @param charset The charset
     */
    constructor(
        text: Text,
        charset: Charset = StandardCharsets.UTF_8
    ) : this({ text.asString().toByteArray(charset) })

    /**
     * Ctor.
     * @param text The source
     * @param charset The charset
     */
    constructor(
        text: Text,
        charset: CharSequence
    ) : this({ text.asString().toByteArray(charset(charset.toString())) })

    /**
     * Ctor.
     * @param error The exception to serialize
     * @param charset Charset
     */
    constructor(
        error: Throwable,
        charset: Charset = StandardCharsets.UTF_8
    ) : this(error, charset.name())

    /**
     * Ctor.
     * @param error The exception to serialize
     * @param charset Charset
     */
    constructor(
        error: Throwable,
        charset: CharSequence
    ) : this(
        {
            ByteArrayOutputStream().use { baos ->
                error.printStackTrace(
                    PrintStream(baos, true, charset.toString())
                )
                baos.toByteArray()
            }
        }
    )

    /**
     * Ctor.
     * @param strace The stack trace
     * @since 0.29
     */
    constructor(vararg strace: StackTraceElement) : this(arrayOf(*strace), StandardCharsets.UTF_8)

    /**
     * Ctor.
     * @param strace The stack trace
     * @param charset Charset
     * @since 0.29
     */
    constructor(
        strace: Array<StackTraceElement>,
        charset: Charset
    ) : this(strace, charset.name())

    /**
     * Ctor.
     * @param strace The stack trace
     * @param charset Charset
     * @since 0.29
     */
    constructor(
        strace: Array<StackTraceElement>,
        charset: CharSequence
    ) : this(
        object : Bytes {
            override fun asBytes(): ByteArray {
                return ByteArrayOutputStream().use { baos ->
                    PrintStream(
                        baos, true, charset.toString()
                    ).use { stream ->
                        for (element in strace) {
                            stream.append(element.toString())
                            stream.append("\n")
                        }
                        baos.toByteArray()
                    }
                }
            }
        }

    )

    /**
     * @param bytes Bytes to encapsulate
     */
    constructor(vararg bytes: Byte) : this({ bytes })

    override fun asBytes(): ByteArray {
        return this.origin.invoke()
    }
}
