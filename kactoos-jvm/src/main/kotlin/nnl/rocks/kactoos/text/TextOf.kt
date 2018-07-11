@file:Suppress("FunctionName")

package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.io.BytesOf
import nnl.rocks.kactoos.io.InputOf
import nnl.rocks.kactoos.iterable.Mapped
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.file.Path

/**
 * Ctor.
 *
 * @param input The Input
 */
fun TextOf(input: Input) = TextOf(BytesOf(input))

/**
 * Ctor.
 * @param url The URL
 * @since 0.16
 */
fun TextOf(url: URL) = TextOf(InputOf(url))

/**
 * Ctor.
 * @param uri The URI
 * @since 0.16
 */
fun TextOf(uri: URI) = TextOf(InputOf(uri))

/**
 * Ctor.
 * @param path The Input
 * @since 0.13
 */
fun TextOf(path: Path) = TextOf(InputOf(path))

/**
 * Ctor.
 * @param file The Input
 * @since 0.13
 */
fun TextOf(file: File) = TextOf(InputOf(file))

/**
 * Ctor.
 *
 * @param input The Input
 * @param cset The Charset
 */
fun TextOf(
    input: Input,
    cset: Charset
) = TextOf(BytesOf(input), cset)

/**
 * Ctor.
 *
 * @param input The Input
 * @param cset The Charset
 */
fun TextOf(
    input: Input,
    cset: String
) = TextOf(BytesOf(input), cset)

/**
 * Ctor.
 *
 * @param input The input
 * @param max Max length of the buffer for reading
 * @param cset The Charset
 */
fun TextOf(
    input: Input,
    max: Int,
    cset: Charset = Charsets.UTF_8
) = TextOf(BytesOf(input, max), cset)

/**
 * Ctor.
 *
 * @param rdr Reader
 */
fun TextOf(rdr: Reader) = TextOf(BytesOf(rdr))

/**
 * Ctor.
 * @param rdr Reader
 * @param cset Charset
 */
fun TextOf(
    rdr: Reader,
    cset: Charset
) = TextOf(BytesOf(rdr, cset))

/**
 * Ctor.
 * @param rdr Reader
 * @param cset Charset
 * @param max Buffer size
 */
fun TextOf(
    rdr: Reader,
    cset: Charset,
    max: Int
) = TextOf(BytesOf(rdr, cset, max))

/**
 * Ctor.
 *
 * @param builder The String builder
 */
fun TextOf(builder: CharSequence) = TextOf(BytesOf(builder))

/**
 * Ctor.
 *
 * @param builder The String builder
 * @param cset The Charset
 */
fun TextOf(
    builder: CharSequence,
    cset: Charset
) = TextOf(BytesOf(builder, cset), cset)

/**
 * Ctor.
 *
 * @param chars The chars
 */
fun TextOf(vararg chars: Char) = TextOf(BytesOf(*chars))

/**
 * Ctor.
 *
 * @param chars The chars
 * @param cset The charset
 */
fun TextOf(
    chars: CharArray,
    cset: Charset
) = TextOf(BytesOf(chars, cset))

/**
 * Ctor.
 * @param error The exception to serialize
 */
fun TextOf(error: Throwable) = TextOf(BytesOf(error))

/**
 * Ctor.
 * @param error The exception to serialize
 * @param charset Charset
 * @since 0.29
 */
fun TextOf(
    error: Throwable,
    charset: Charset
) = TextOf(BytesOf(error, charset))

/**
 * Ctor.
 * @param error The exception to serialize
 * @param charset Charset
 * @since 0.29
 */
fun TextOf(
    error: Throwable,
    charset: CharSequence
) = TextOf(BytesOf(error, charset))

/**
 * Ctor.
 * @param strace The stacktrace to serialize
 * @since 0.29
 */
fun TextOf(vararg strace: StackTraceElement) = TextOf(BytesOf(*strace))

/**
 * Ctor.
 * @param strace The stacktrace to serialize
 * @param charset Charset
 * @since 0.29
 */
fun TextOf(
    strace: Array<StackTraceElement>,
    charset: Charset
) = TextOf(BytesOf(strace, charset))

/**
 * Ctor.
 * @param strace The stacktrace to serialize
 * @param charset Charset
 * @since 0.29
 */
fun TextOf(
    strace: Array<StackTraceElement>,
    charset: CharSequence
) = TextOf(BytesOf(strace, charset))

/**
 * Ctor.
 *
 * @param bytes The array of bytes
 */
fun TextOf(vararg bytes: Byte) = TextOf(BytesOf(*bytes))

/**
 * Ctor.
 *
 * @param bytes The Bytes
 * @param cset The Charset
 */
fun TextOf(
    bytes: Bytes,
    cset: Charset = Charsets.UTF_8
) = TextOf { String(bytes.asBytes(), cset) }

/**
 * Ctor.
 *
 * @param bytes The Bytes
 * @param cset The Charset
 */
fun TextOf(
    bytes: Bytes,
    cset: String
) = TextOf { String(bytes.asBytes(), Charset.forName(cset)) }

/**
 * Ctor.
 *
 * @param input The String
 * @param cset The Charset
 */
fun TextOf(
    input: String,
    cset: Charset = Charsets.UTF_8
) = TextOf { String(input.toByteArray(cset), cset) }

/**
 * Ctor.
 * @param input The InputStream where the text is read from
 * @since 0.21
 */
fun TextOf(input: InputStream) = TextOf(InputOf(InputStreamReader(input)))
