package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text
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
 * TextOf various inputs available on JDK.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.5
 */
class JDKTextOf(origin: KText) : TextEnvelope(origin) {

    constructor(
        origin: Text
    ) : this(
        { origin.asString() }
    )

    constructor(
        input: Input
    ) : this(
        BytesOf(input)
    )

    constructor(
        url: URL
    ) : this(
        InputOf(url)
    )

    constructor(
        uri: URI
    ) : this(
        InputOf(uri)
    )

    constructor(
        path: Path
    ) : this(
        InputOf(path)
    )

    constructor(
        file: File
    ) : this(
        InputOf(file)
    )

    constructor(
        input: Input,
        charset: Charset
    ) : this(
        BytesOf(input),
        charset
    )

    constructor(
        input: Input,
        charset: String
    ) : this(
        BytesOf(input),
        charset
    )

    constructor(
        input: Input,
        max: Int,
        charset: Charset = Charsets.UTF_8
    ) : this(
        BytesOf(input, max),
        charset
    )

    constructor(
        reader: Reader
    ) : this(
        BytesOf(reader)
    )

    constructor(
        reader: Reader,
        charset: Charset
    ) : this(
        BytesOf(reader, charset)
    )

    constructor(
        reader: Reader,
        charset: Charset,
        max: Int
    ) : this(
        BytesOf(reader, charset, max)
    )

    constructor(
        charSequence: CharSequence
    ) : this(
        BytesOf(charSequence)
    )

    constructor(
        charSequence: CharSequence,
        charset: Charset
    ) : this(
        BytesOf(charSequence, charset),
        charset
    )

    constructor(
        vararg chars: Char
    ) : this(
        BytesOf(*chars)
    )

    constructor(
        chars: CharArray,
        charset: Charset
    ) : this(
        BytesOf(chars, charset)
    )

    constructor(
        error: Throwable
    ) : this(
        BytesOf(error)
    )

    constructor(
        error: Throwable,
        charset: Charset
    ) : this(
        BytesOf(error, charset)
    )

    constructor(
        error: Throwable,
        charset: CharSequence
    ) : this(
        BytesOf(error, charset)
    )

    constructor(
        vararg traces: StackTraceElement
    ) : this(
        BytesOf(*traces)
    )

    constructor(
        traces: Array<StackTraceElement>,
        charset: Charset
    ) : this(
        BytesOf(traces, charset)
    )

    constructor(
        traces: Array<StackTraceElement>,
        charset: CharSequence
    ) : this(
        BytesOf(traces, charset)
    )

    constructor(
        vararg bytes: Byte
    ) : this(
        BytesOf(*bytes)
    )

    constructor(
        bytes: Bytes,
        charset: Charset = Charsets.UTF_8
    ) : this(
        { String(bytes.asBytes(), charset) }
    )

    constructor(
        bytes: Bytes,
        charset: String
    ) : this(
        { String(bytes.asBytes(), charset(charset)) }
    )

    constructor(
        input: String,
        charset: Charset = Charsets.UTF_8
    ) : this(
        { String(input.toByteArray(charset), charset) }
    )

    constructor(
        iterable: Iterable<Any>
    ) : this(
        JoinedText(
            ", ",
            Mapped<Any, String>(
                func = { it: Any -> it.toString() },
                iterable = iterable
            )
        )
    )

    constructor(
        input: InputStream
    ) : this(
        InputOf(InputStreamReader(input))
    )
}
