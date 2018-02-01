package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.InputHasContent
import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import org.takes.http.FtRemote
import org.takes.tk.TkHtml
import java.io.ByteArrayInputStream
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.StringReader
import java.net.URL
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [InputOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @author Kirill (g4s8.public@gmail.com)
 * @author Ix (ixmanuel@yahoo.com)
 * @version $Id: ae68a5790bb68cd7b66191edbdc72a43c85c7c18 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class InputOfTest {

    @Test
    @Throws(IOException::class)
    fun readsAlternativeInputForFileCase() {
        MatcherAssert.assertThat(
            "Can't read alternative source from file not found",
            TextOf(
                InputWithFallback(
                    InputOf(
                        File("/this-file-does-not-exist.txt")
                    ),
                    InputOf(TextOf("Alternative text!"))
                )
            ),
            TextHasString(Matchers.endsWith("text!"))
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsSimpleFileContent() {
        val temp = Files.createTempFile("cactoos-1", "txt-1")
        val content = "Hello, товарищ!"
        Files.write(temp, content.toByteArray(StandardCharsets.UTF_8))
        MatcherAssert.assertThat(
            "Can't read file content",
            InputOf(temp),
            InputHasContent(content)
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
                )
            ).asString(),
            MatcherOf { text -> closed.get() }
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsFileContent() {
        MatcherAssert.assertThat(
            "Can't read bytes from a file-system URL",
            BytesOf(
                InputOf(
                    this.javaClass.getResource(
                        "/org/cactoos/io/InputOf.class"
                    )
                )
            ).asBytes().size,
            Matchers.greaterThan(0)
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsRealUrl() {
        FtRemote(TkHtml("<html>How are you?</html>")).exec { home ->
            MatcherAssert.assertThat(
                "Can't fetch bytes from the URL",
                TextOf(
                    InputOf(home)
                ),
                TextHasString(
                    Matchers.allOf<T>(
                        Matchers.startsWith("<html"),
                        Matchers.endsWith("html>")
                    )
                )
            )
        }
    }

    @Test
    @Throws(IOException::class)
    fun readsStringUrl() {
        MatcherAssert.assertThat(
            "Can't fetch bytes from the HTTPS URL",
            TextOf(
                BytesOf(
                    InputOf(
                        URL(
                            // @checkstyle LineLength (1 line)
                            "file:src/test/resources/org/cactoos/large-text.txt"
                        )
                    )
                )
            ),
            TextHasString(Matchers.containsString("Lorem ipsum"))
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsStringIntoBytes() {
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
    fun readsStringBuilder() {
        val starts = "Name it, "
        val ends = "then it exists!"
        MatcherAssert.assertThat(
            "Can't receive a string builder",
            String(
                BytesOf(
                    InputOf(
                        StringBuilder(starts)
                            .append(ends)
                    )
                ).asBytes()
            ),
            Matchers.allOf(
                Matchers.startsWith(starts),
                Matchers.endsWith(ends)
            )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsStringBuffer() {
        val starts = "The future "
        val ends = "is now!"
        MatcherAssert.assertThat(
            "Can't receive a string buffer",
            String(
                BytesOf(
                    InputOf(
                        StringBuffer(starts)
                            .append(ends)
                    )
                ).asBytes()
            ),
            Matchers.allOf(
                Matchers.startsWith(starts),
                Matchers.endsWith(ends)
            )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsArrayOfChars() {
        MatcherAssert.assertThat(
            "Can't read array of chars.",
            String(
                BytesOf(
                    InputOf(
                        'H', 'o', 'l', 'd', ' ',
                        'i', 'n', 'f', 'i', 'n', 'i', 't', 'y'
                    )
                ).asBytes()
            ),
            Matchers.allOf(
                Matchers.startsWith("Hold "),
                Matchers.endsWith("infinity")
            )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsEncodedArrayOfChars() {
        MatcherAssert.assertThat(
            "Can't read array of encoded chars.",
            String(
                BytesOf(
                    InputOf(
                        charArrayOf(
                            'O', ' ', 'q', 'u', 'e', ' ', 's', 'e', 'r', 'a', ' ', 'q', 'u', 'e', ' ', 's', 'e', 'r',
                            'a'
                        ),
                        StandardCharsets.UTF_8
                    )
                ).asBytes(),
                StandardCharsets.UTF_8
            ),
            Matchers.allOf(
                Matchers.startsWith("O que sera"),
                Matchers.endsWith(" que sera")
            )
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsStringFromReader() {
        val source = "hello, source!"
        MatcherAssert.assertThat(
            "Can't read string through a reader",
            TextOf(
                InputOf(
                    StringReader(source)
                )
            ).asString(),
            Matchers.equalTo(source)
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsEncodedStringFromReader() {
        val source = "hello, друг!"
        MatcherAssert.assertThat(
            "Can't read encoded string through a reader",
            TextOf(
                InputAsBytes(
                    InputOf(
                        StringReader(source),
                        StandardCharsets.UTF_8
                    )
                )
            ).asString(),
            Matchers.equalTo(source)
        )
    }

    @Test
    @Throws(Exception::class)
    fun readsAnArrayOfBytes() {
        val bytes = byteArrayOf(0xCA.toByte(), 0xFE.toByte())
        MatcherAssert.assertThat(
            "Can't read array of bytes",
            InputAsBytes(
                SyncInput(InputOf(bytes))
            ).asBytes(),
            Matchers.equalTo(bytes)
        )
    }

    @Test
    @Throws(IOException::class)
    fun makesDataAvailable() {
        val content = "Hello,חבר!"
        MatcherAssert.assertThat(
            "Can't show that data is available",
            InputOf(content).stream().available(),
            Matchers.greaterThan(0)
        )
    }
}
