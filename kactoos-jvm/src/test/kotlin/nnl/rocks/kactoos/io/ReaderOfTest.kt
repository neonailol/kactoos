package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.InputHasContent
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Test case for [ReaderOf].
 *
 *
 *
 * @since 0.13
 *
 *
 */
class ReaderOfTest {

    @Test
    @Throws(IOException::class)
    fun readsSimpleFileContent() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        val content = "Hello, товарищ!"
        Files.write(temp, content.toByteArray(StandardCharsets.UTF_8))
        MatcherAssert.assertThat(
            "Can't read file content",
            InputOf(ReaderOf(temp)),
            InputHasContent(content)
        )
    }
}
