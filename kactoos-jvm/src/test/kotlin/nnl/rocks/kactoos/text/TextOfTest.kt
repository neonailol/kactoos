
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.io.BytesOf
import nnl.rocks.kactoos.io.InputOf
import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.StringReader
import java.nio.charset.StandardCharsets

/**
 * Test case for [TextOf].
 *
 * @author Ix (ixmanuel@yahoo.com)
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 7ae4be97c2ac7de9d6f3dc83ad18c5f6871fa129 $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class TextOfTest {

    @Test
    @Throws(IOException::class)
    fun readsInputIntoText() {
        MatcherAssert.assertThat(
                "Can't read text from Input",
                SyncText(
                        TextOf(
                                InputOf("привет, друг!"),
                                StandardCharsets.UTF_8
                        )
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith("привет, "),
                        Matchers.endsWith("друг!")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoTextWithDefaultCharset() {
        MatcherAssert.assertThat(
                "Can't read text from Input with default charset",
                TextOf(
                        InputOf("Hello, друг! with default charset")
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith("Hello, "),
                        Matchers.endsWith("друг! with default charset")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoTextWithSmallBuffer() {
        MatcherAssert.assertThat(
                "Can't read text with a small reading buffer",
                TextOf(
                        InputOf("Hi, товарищ! with small buffer"),
                        2,
                        StandardCharsets.UTF_8
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith("Hi,"),
                        Matchers.endsWith("товарищ! with small buffer")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoTextWithSmallBufferAndDefaultCharset() {
        MatcherAssert.assertThat(
                "Can't read text with a small reading buffer and default charset",
                TextOf(
                        InputOf("Hello, товарищ! with default charset"),
                        2
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith("Hello,"),
                        Matchers.endsWith("товарищ! with default charset")
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsFromReader() {
        val source = "hello, друг!"
        MatcherAssert.assertThat(
                "Can't read string through a reader",
                TextOf(
                        StringReader(source),
                        StandardCharsets.UTF_8
                ).asString(),
                Matchers.equalTo(
                        String(
                                BytesOf(source).asBytes(),
                                StandardCharsets.UTF_8
                        )
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsFromReaderWithDefaultEncoding() {
        val source = "hello, друг! with default encoding"
        MatcherAssert.assertThat(
                "Can't read string with default encoding through a reader",
                TextOf(StringReader(source)).asString(),
                Matchers.equalTo(
                        String(
                                BytesOf(source).asBytes(),
                                StandardCharsets.UTF_8
                        )
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsEncodedArrayOfCharsIntoText() {
        MatcherAssert.assertThat(
                "Can't read array of encoded chars into text.",
                TextOf(
                        'O', ' ', 'q', 'u', 'e', ' ', 's', 'e', 'r', 'a',
                        ' ', 'q', 'u', 'e', ' ', 's', 'e', 'r', 'a'
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith("O que sera"),
                        Matchers.endsWith(" que sera")
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsAnArrayOfBytes() {
        val bytes = byteArrayOf(0xCA.toByte(), 0xFE.toByte())
        MatcherAssert.assertThat(
                "Can't read array of bytes",
                TextOf(
                        *bytes
                ).asString(),
                Matchers.equalTo(String(bytes, StandardCharsets.UTF_8))
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsStringBuilder() {
        val starts = "Name it, "
        val ends = "then it exists!"
        MatcherAssert.assertThat(
                "Can't process a string builder",
                TextOf(
                        StringBuilder(starts).append(ends)
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith(starts),
                        Matchers.endsWith(ends)
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsStringBuffer() {
        val starts = "In our daily life, "
        val ends = "we can smile!"
        MatcherAssert.assertThat(
                "Can't process a string builder hahahaha",
                TextOf(
                        StringBuffer(starts).append(ends)
                ).asString(),
                Matchers.allOf(
                        Matchers.startsWith(starts),
                        Matchers.endsWith(ends)
                )
        )
    }

    @Test
    fun printsStackTrace() {
        MatcherAssert.assertThat(
                "Can't print exception stacktrace",
                TextOf(
                        IOException(
                                "It doesn't work at all"
                        )
                ),
                TextHasString(
                        Matchers.allOf<String>(
                                Matchers.containsString("java.io.IOException"),
                                Matchers.containsString("doesn't work at all"),
                                Matchers.containsString(
                                        "\tat nnl.rocks.kactoos.text.TextOfTest"
                                )
                        )
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsFromInputStream() {
        val content = "line1"
        val stream = ByteArrayInputStream(
                content.toByteArray(charset(StandardCharsets.UTF_8.name()))
        )
        MatcherAssert.assertThat(
                "Can't read inputStream",
                TextOf(stream).asString(),
                Matchers.equalTo(
                        String(content.toByteArray(), StandardCharsets.UTF_8)
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsMultilineInputStream() {
        val content = "line1-\nline2"
        val stream = ByteArrayInputStream(
                content.toByteArray(charset(StandardCharsets.UTF_8.name()))
        )
        MatcherAssert.assertThat(
                "Can't read multiline inputStream",
                TextOf(stream).asString(),
                Matchers.equalTo(content)
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsMultilineInputStreamWithCarriageReturn() {
        val content = "line1-\rline2"
        val stream = ByteArrayInputStream(
                content.toByteArray(charset(StandardCharsets.UTF_8.name()))
        )
        MatcherAssert.assertThat(
                "Can't read multiline inputStream with carriage return",
                TextOf(stream).asString(),
                Matchers.equalTo(content)
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsClosedInputStream() {
        val content = "content"
        val stream = ByteArrayInputStream(
                content.toByteArray(charset(StandardCharsets.UTF_8.name()))
        )
        stream.close()
        MatcherAssert.assertThat(
                "Can't read closed input stream",
                TextOf(stream).asString(),
                Matchers.equalTo(content)
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsEmptyInputStream() {
        val content = ""
        val stream = ByteArrayInputStream(
                content.toByteArray(charset(StandardCharsets.UTF_8.name()))
        )
        MatcherAssert.assertThat(
                "Can't read empty input stream",
                TextOf(stream).asString(),
                Matchers.equalTo(content)
        )
    }

    @Test
    fun printsStackTraceFromArray() {
        MatcherAssert.assertThat(
                "Can't print exception stacktrace from array",
                TextOf(
                        IOException("").stackTrace
                ),
                TextHasString(
                        Matchers.containsString("nnl.rocks.kactoos.text.TextOfTest")
                )
        )
    }
}
