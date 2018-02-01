
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.iterable.Endless
import nnl.rocks.kactoos.iterable.Limited
import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.JoinedText
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.StringReader
import java.nio.charset.StandardCharsets
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [BytesOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @author Ix (ixmanuel@yahoo.com)
 * @version $Id: 8f15e73770e279c1864b603cb9f082556337a14c $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class BytesOfTest {

    @Test
    @Throws(IOException::class)
    fun readsLargeInMemoryContent() {
        val multiplier = 5000
        val body = "1234567890"
        MatcherAssert.assertThat(
                "Can't read large content from in-memory Input",
                BytesOf(
                        InputOf(
                                JoinedText(
                                        "",
                                        Limited(
                                                multiplier, Endless(body)
                                        )
                                )
                        )
                ).asBytes().size,
                Matchers.equalTo(body.length * multiplier)
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoBytes() {
        MatcherAssert.assertThat(
                "Can't read bytes from Input",
                String(
                        BytesOf(
                                InputOf("Hello, друг!")
                        ).asBytes(),
                        StandardCharsets.UTF_8
                ),
                Matchers.allOf(
                        Matchers.startsWith("Hello, "),
                        Matchers.endsWith("друг!")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsFromReader() {
        val source = "hello, друг!"
        MatcherAssert.assertThat(
                "Can't read string through a reader",
                TextOf(
                        BytesOf(
                                StringReader(source),
                                StandardCharsets.UTF_8,
                                // @checkstyle MagicNumberCheck (1 line)
                                16 shl 10
                        )
                ).asString(),
                Matchers.equalTo(source)
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoBytesWithSmallBuffer() {
        MatcherAssert.assertThat(
                "Can't read bytes from Input with a small reading buffer",
                String(
                        BytesOf(
                                InputOf(
                                        TextOf("Hello, товарищ!")
                                ),
                                2
                        ).asBytes(),
                        StandardCharsets.UTF_8
                ),
                Matchers.allOf(
                        Matchers.startsWith("Hello,"),
                        Matchers.endsWith("товарищ!")
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun closesInputStream() {
        val closed = AtomicBoolean()
        val input = ByteArrayInputStream(
                "how are you?".toByteArray()
        )
        MatcherAssert.assertThat(
                "Can't close InputStream correctly",
                TextOf(
                        InputOf(
                                object : InputStream() {
                                    @Throws(IOException::class)
                                    override fun read(): Int {
                                        return input.read()
                                    }

                                    @Throws(IOException::class)
                                    override fun close() {
                                        input.close()
                                        closed.set(true)
                                    }
                                }
                        ),
                        StandardCharsets.UTF_8
                ).asString(),
                MatcherOf { text -> closed.get() }
        )
    }

    @Test
    @Throws(IOException::class)
    fun asBytes() {
        val text = TextOf("Hello!")
        MatcherAssert.assertThat(
                "Can't convert text into bytes",
                BytesOf(
                        InputOf(text)
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf(text.asString()).asBytes()
                )
        )
    }

    @Test
    fun printsStackTrace() {
        MatcherAssert.assertThat(
                "Can't print exception stacktrace",
                TextOf(
                        BytesOf(
                                IOException(
                                        "It doesn't work at all"
                                )
                        )
                ),
                TextHasString(
                        Matchers.allOf<T>(
                                Matchers.containsString("java.io.IOException"),
                                Matchers.containsString("doesn't work at all"),
                                Matchers.containsString(
                                        "\tat nnl.rocks.kactoos.io.BytesOfTest"
                                )
                        )
                )
        )
    }

    @Test
    fun printsStackTraceFromArray() {
        MatcherAssert.assertThat(
                "Can't print exception stacktrace from array",
                TextOf(
                        BytesOf(
                                IOException("").stackTrace
                        )
                ),
                TextHasString(
                        Matchers.containsString("nnl.rocks.kactoos.io.BytesOfTest")
                )
        )
    }
}
