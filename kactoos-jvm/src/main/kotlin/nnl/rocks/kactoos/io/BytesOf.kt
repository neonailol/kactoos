package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KBytes
import nnl.rocks.kactoos.Text
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
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
 * @since 0.12
 */
class BytesOf(
    private val origin: KBytes
) : Bytes {

    /**
     * @param bytes The input
     */
    constructor(bytes: Bytes) : this({ bytes.asBytes() })

    /**
     * @param input The input
     */
    constructor(input: Input) : this(InputAsBytes(input))

    /**
     * @param file The input
     * @since 0.13
     */
    constructor(file: File) : this(InputOf(file))

    /**
     * @param path The input
     * @since 0.13
     */
    constructor(path: Path) : this(InputOf(path))

    /**
     * @param input The input
     * @param max Max length of the buffer for reading
     */
    constructor(
        input: Input,
        max: Int
    ) : this(InputAsBytes(input, max))

    /**
     * @param rdr Reader
     */
    constructor(rdr: Reader) : this(ReaderAsBytes(rdr))

    /**
     * @param rdr Reader
     * @param charset Charset
     */
    constructor(
        rdr: Reader,
        charset: Charset
    ) : this(ReaderAsBytes(rdr, charset))

    /**
     * @param rdr Reader
     * @param charset Charset
     */
    constructor(
        rdr: Reader,
        charset: CharSequence
    ) : this(ReaderAsBytes(rdr, charset))

    /**
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
     * @param rdr Reader
     * @param max Buffer size
     * @since 0.13.3
     */
    constructor(
        rdr: Reader,
        max: Int
    ) : this(ReaderAsBytes(rdr, max))

    /**
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
     * @param input The source
     * @param charset The charset
     */
    constructor(
        input: CharSequence,
        charset: Charset
    ) : this(
        { input.toString().toByteArray(charset) }
    )

    /**
     * @param input The source
     */
    constructor(input: CharSequence) : this(
        input, StandardCharsets.UTF_8
    )

    /**
     * @param input The source
     * @param charset The charset
     */
    constructor(
        input: CharSequence,
        charset: CharSequence
    ) : this({ input.toString().toByteArray(charset(charset.toString())) })

    /**
     * @param chars The chars
     */
    @SafeVarargs
    constructor(vararg chars: Char) : this(chars, StandardCharsets.UTF_8)

    /**
     * @param chars The chars
     * @param charset The charset
     */
    constructor(
        chars: CharArray,
        charset: Charset
    ) : this(String(chars), charset)

    /**
     * @param chars The chars
     * @param charset The charset
     */
    constructor(
        chars: CharArray,
        charset: CharSequence
    ) : this(String(chars), charset)

    /**
     * @param text The source
     * @param charset The charset
     */
    constructor(
        text: Text,
        charset: Charset
    ) : this({ text.asString().toByteArray(charset) })

    constructor(
        text: Text
    ) : this(text, StandardCharsets.UTF_8)

    /**
     * @param text The source
     * @param charset The charset
     */
    constructor(
        text: Text,
        charset: CharSequence
    ) : this({ text.asString().toByteArray(charset(charset.toString())) })

    /**
     * @param error The exception to serialize
     * @param charset Charset
     */
    constructor(
        error: Throwable,
        charset: Charset
    ) : this(error, charset.name())

    constructor(error: Throwable) : this(error, StandardCharsets.UTF_8)

    /**
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
     * @param bytes Bytes to encapsulate
     */
    constructor(vararg bytes: Byte) : this({ bytes })

    /**
     * @param strace The stack trace
     * @since 0.3
     */
    constructor(strace: Array<StackTraceElement>) : this(strace, StandardCharsets.UTF_8)

    /**
     * @param strace The stack trace
     * @param charset Charset
     * @since 0.3
     */
    constructor(
        strace: Array<StackTraceElement>,
        charset: Charset
    ) : this(strace, charset.name())

    /**
     * @param strace The stack trace
     * @param charset Charset
     * @since 0.3
     */
    constructor(
        strace: Array<StackTraceElement>,
        charset: CharSequence
    ) : this(
        {
            ByteArrayOutputStream().use { baos ->
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
    )

    @Throws(IOException::class)
    override fun asBytes(): ByteArray {
        return this.origin()
    }
}
