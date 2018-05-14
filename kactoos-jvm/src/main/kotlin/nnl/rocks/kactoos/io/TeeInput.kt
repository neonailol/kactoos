package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Output
import nnl.rocks.kactoos.Text
import java.io.File
import java.io.InputStream
import java.io.Reader
import java.io.Writer
import java.net.URI
import java.net.URL
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.Path

/**
 * Input to Output copying pipe.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class TeeInput(
    private val source: Input,
    private val target: Output
) : Input {

    /**
     * @param url The source
     * @param path The output file
     * @since 0.13.3
     */
    constructor(
        url: URL,
        path: Path
    ) : this(InputOf(url), OutputTo(path))

    /**
     * @param url The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        url: URL,
        file: File
    ) : this(InputOf(url), OutputTo(file))

    /**
     * @param url The source
     * @param output The output file
     * @since 0.13.3
     */
    constructor(
        url: URL,
        output: Output
    ) : this(InputOf(url), output)

    /**
     * @param uri The source
     * @param path The output file
     * @since 0.13.3
     */
    constructor(
        uri: URI,
        path: Path
    ) : this(InputOf(uri), OutputTo(path))

    /**
     * @param uri The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        uri: URI,
        file: File
    ) : this(InputOf(uri), OutputTo(file))

    /**
     * @param uri The source
     * @param output The output file
     * @since 0.13.3
     */
    constructor(
        uri: URI,
        output: Output
    ) : this(InputOf(uri), output)

    /**
     * @param input The source
     * @param path The output file
     * @since 0.5
     */
    constructor(
        input: Path,
        path: Path
    ) : this(InputOf(input), OutputTo(path))

    /**
     * @param input The source
     * @param file The output file
     * @since 0.5
     */
    constructor(
        input: Path,
        file: File
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param output The output
     * @since 0.13.3
     */
    constructor(
        input: Path,
        output: Output
    ) : this(InputOf(input), output)

    /**
     * @param input The source
     * @param file The output file
     * @since 0.5
     */
    constructor(
        input: File,
        file: File
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param path The output file
     * @since 0.5
     */
    constructor(
        input: File,
        path: Path
    ) : this(InputOf(input), OutputTo(path))

    /**
     * @param input The source
     * @param output The output
     * @since 0.13.3
     */
    constructor(
        input: File,
        output: Output
    ) : this(InputOf(input), output)

    /**
     * @param input The source
     * @param file The output file
     * @since 0.5
     */
    constructor(
        input: CharSequence,
        file: File
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: CharSequence,
        file: File,
        charset: Charset
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: CharSequence,
        file: File,
        charset: CharSequence
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @since 0.5
     */
    constructor(
        input: CharSequence,
        file: Path
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: CharSequence,
        file: Path,
        charset: Charset
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: CharSequence,
        file: Path,
        charset: CharSequence
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param output The target
     * @since 0.5
     */
    constructor(
        input: CharSequence,
        output: Output
    ) : this(InputOf(input), output)

    /**
     * @param input The source
     * @param output The target
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: CharSequence,
        output: Output,
        charset: Charset
    ) : this(InputOf(input, charset), output)

    /**
     * @param input The source
     * @param output The target
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: CharSequence,
        output: Output,
        charset: CharSequence
    ) : this(InputOf(input, charset), output)

    /**
     * @param input The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: File
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param size Reading buffer size
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: File,
        size: Int
    ) : this(InputOf(input, size), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: File,
        charset: Charset
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @param size Reading buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Reader,
        file: File,
        charset: Charset,
        size: Int
    ) : this(InputOf(input, charset, size), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: File,
        charset: CharSequence
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @param size Reading buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Reader,
        file: File,
        charset: CharSequence,
        size: Int
    ) : this(InputOf(input, charset, size), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: Path
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param size Reading buffer size
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: Path,
        size: Int
    ) : this(InputOf(input, size), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: Path,
        charset: Charset
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @param size Reading buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Reader,
        file: Path,
        charset: Charset,
        size: Int
    ) : this(InputOf(input, charset, size), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        file: Path,
        charset: CharSequence
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset The charset
     * @param size Reading buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Reader,
        file: Path,
        charset: CharSequence,
        size: Int
    ) : this(InputOf(input, charset, size), OutputTo(file))

    /**
     * @param input The source
     * @param output The target
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        output: Output
    ) : this(InputOf(input), output)

    /**
     * @param input The source
     * @param output The target
     * @param size Reading buffer size
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        output: Output,
        size: Int
    ) : this(InputOf(input, size), output)

    /**
     * @param input The source
     * @param output The target
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        output: Output,
        charset: Charset
    ) : this(InputOf(input, charset), output)

    /**
     * @param input The source
     * @param output The target
     * @param charset The charset
     * @param size Reading buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Reader,
        output: Output,
        charset: Charset,
        size: Int
    ) : this(InputOf(input, charset, size), output)

    /**
     * @param input The source
     * @param output The target
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Reader,
        output: Output,
        charset: CharSequence
    ) : this(InputOf(input, charset), output)

    /**
     * @param input The source
     * @param output The target
     * @param charset The charset
     * @param size Reading buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Reader,
        output: Output,
        charset: CharSequence,
        size: Int
    ) : this(InputOf(input, charset, size), output)

    /**
     * @param input The source
     * @param path The output path
     * @since 0.5
     */
    constructor(
        input: ByteArray,
        path: Path
    ) : this(InputOf(input), OutputTo(path))

    /**
     * @param input The source
     * @param file The output file
     * @since 0.5
     */
    constructor(
        input: ByteArray,
        file: File
    ) : this(InputOf(input), OutputTo(file))

    /**
     * @param input The source
     * @param output The output file
     * @since 0.5
     */
    constructor(
        input: ByteArray,
        output: Output
    ) : this(InputOf(input), output)

    /**
     * @param input The source
     * @param path The output path
     * @since 0.5
     */
    constructor(
        input: CharArray,
        path: Path
    ) : this(InputOf(input, StandardCharsets.UTF_8), OutputTo(path))

    /**
     * @param input The source
     * @param path The output path
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        input: CharArray,
        path: Path,
        charset: Charset
    ) : this(InputOf(input, charset), OutputTo(path))

    /**
     * @param input The source
     * @param path The output path
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        input: CharArray,
        path: Path,
        charset: CharSequence
    ) : this(InputOf(input, charset), OutputTo(path))

    /**
     * @param input The source
     * @param file The output file
     * @since 0.5
     */
    constructor(
        input: CharArray,
        file: File
    ) : this(InputOf(input, StandardCharsets.UTF_8), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        input: CharArray,
        file: File,
        charset: Charset
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param file The output file
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        input: CharArray,
        file: File,
        charset: CharSequence
    ) : this(InputOf(input, charset), OutputTo(file))

    /**
     * @param input The source
     * @param output The output file
     * @since 0.5
     */
    constructor(
        input: CharArray,
        output: Output
    ) : this(InputOf(input, StandardCharsets.UTF_8), output)

    /**
     * @param input The source
     * @param output The output file
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        input: CharArray,
        output: Output,
        charset: Charset
    ) : this(InputOf(input, charset), output)

    /**
     * @param input The source
     * @param output The output file
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        input: CharArray,
        output: Output,
        charset: CharSequence
    ) : this(InputOf(input, charset), output)

    /**
     * @param text The source
     * @param path The output path
     * @since 0.13.3
     */
    constructor(
        text: Text,
        path: Path
    ) : this(InputOf(text), OutputTo(path))

    /**
     * @param text The source
     * @param path The output path
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        text: Text,
        path: Path,
        charset: Charset
    ) : this(InputOf(text, charset), OutputTo(path))

    /**
     * @param text The source
     * @param path The output path
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        text: Text,
        path: Path,
        charset: CharSequence
    ) : this(InputOf(text, charset), OutputTo(path))

    /**
     * @param text The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        text: Text,
        file: File
    ) : this(InputOf(text), OutputTo(file))

    /**
     * @param text The source
     * @param file The output file
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        text: Text,
        file: File,
        charset: Charset
    ) : this(InputOf(text, charset), OutputTo(file))

    /**
     * @param text The source
     * @param file The output file
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        text: Text,
        file: File,
        charset: CharSequence
    ) : this(InputOf(text, charset), OutputTo(file))

    /**
     * @param text The source
     * @param output The output
     * @since 0.13.3
     */
    constructor(
        text: Text,
        output: Output
    ) : this(InputOf(text), output)

    /**
     * @param text The source
     * @param output The output
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        text: Text,
        output: Output,
        charset: Charset
    ) : this(InputOf(text, charset), output)

    /**
     * @param text The source
     * @param output The output
     * @param charset Charset
     * @since 0.13.3
     */
    constructor(
        text: Text,
        output: Output,
        charset: CharSequence
    ) : this(InputOf(text, charset), output)

    /**
     * @param bytes The source
     * @param path The output path
     * @since 0.13.3
     */
    constructor(
        bytes: Bytes,
        path: Path
    ) : this(InputOf(bytes), OutputTo(path))

    /**
     * @param bytes The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        bytes: Bytes,
        file: File
    ) : this(InputOf(bytes), OutputTo(file))

    /**
     * @param bytes The source
     * @param output The output
     * @since 0.13.3
     */
    constructor(
        bytes: Bytes,
        output: Output
    ) : this(InputOf(bytes), output)

    /**
     * @param input The source
     * @param path The output path
     * @since 0.13.3
     */
    constructor(
        input: Input,
        path: Path
    ) : this(input, OutputTo(path))

    /**
     * @param input The source
     * @param file The output file
     * @since 0.13.3
     */
    constructor(
        input: Input,
        file: File
    ) : this(input, OutputTo(file))

    /**
     * @param input The source
     * @param writer The output
     * @since 0.13.3
     */
    constructor(
        input: Input,
        writer: Writer
    ) : this(input, OutputTo(writer))

    /**
     * @param input The source
     * @param writer The output
     * @param size Writing buffer size
     * @since 0.13.3
     */
    constructor(
        input: Input,
        writer: Writer,
        size: Int
    ) : this(input, OutputTo(writer, size))

    /**
     * @param input The source
     * @param writer The output
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Input,
        writer: Writer,
        charset: Charset
    ) : this(input, OutputTo(writer, charset))

    /**
     * @param input The source
     * @param writer The output
     * @param charset The charset
     * @param size Writing buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Input,
        writer: Writer,
        charset: Charset,
        size: Int
    ) : this(input, OutputTo(writer, charset, size))

    /**
     * @param input The source
     * @param writer The output
     * @param charset The charset
     * @since 0.13.3
     */
    constructor(
        input: Input,
        writer: Writer,
        charset: CharSequence
    ) : this(input, OutputTo(writer, charset))

    /**
     * @param input The source
     * @param writer The output
     * @param charset The charset
     * @param size Writing buffer size
     * @since 0.13.3
     *
     */
    constructor(
        input: Input,
        writer: Writer,
        charset: CharSequence,
        size: Int
    ) : this(input, OutputTo(writer, charset, size))

    override fun stream(): InputStream = TeeInputStream(this.source.stream(), this.target.stream())
}
