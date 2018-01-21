package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.InputHasContent
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException
import java.io.StringReader
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Test case for [InputStreamOf].
 *
 *
 *
 * @since 0.13
 *
 *
 */
class InputStreamOfTest {

    @Test
    @Throws(IOException::class)
    fun readsSimpleFileContent() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        val content = "Hello, товарищ!"
        Files.write(temp, content.toByteArray(StandardCharsets.UTF_8))
        MatcherAssert.assertThat(
            "Can't read file content",
            InputOf(InputStreamOf(temp)),
            InputHasContent(content)
        )
    }

    @Test
    fun readsFromReader() {
        val content = "Hello, дорогой товарищ!"
        MatcherAssert.assertThat(
            "Can't read from reader",
            InputOf(InputStreamOf(StringReader(content))),
            InputHasContent(content)
        )
    }

    @Test
    fun readsFromReaderThroughSmallBuffer() {
        val content = "Hello, صديق!"
        MatcherAssert.assertThat(
            "Can't read from reader through small buffer",
            InputOf(InputStreamOf(StringReader(content), 1)),
            InputHasContent(content)
        )
    }

    @Test
    @Throws(IOException::class)
    fun makesDataAvailable() {
        val content = "Hello,חבר!"
        MatcherAssert.assertThat(
            "Can't show that data is available",
            InputStreamOf(content).available(),
            Matchers.greaterThan(0)
        )
    }
}
