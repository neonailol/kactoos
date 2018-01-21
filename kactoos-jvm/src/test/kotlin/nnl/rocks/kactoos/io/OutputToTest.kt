package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.InputHasContent
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [OutputTo].
 *
 *
 *
 * @since 0.15
 *
 *
 */
class OutputToTest {

    @Test
    @Throws(IOException::class)
    fun writesSimplePathContent() {
        val temp = Files.createTempDirectory("kactoos-1")
        val path = temp.resolve("one/two/three/file.txt")
        val content = "Hello, товарищ!"
        LengthOf(TeeInput(content, OutputTo(path))).toInt()
        MatcherAssert.assertThat(
            "Can't write path content",
            InputOf(path),
            InputHasContent(content)
        )
    }

    @Test
    @Throws(IOException::class)
    fun writesSimpleFileContent() {
        val temp = Files.createTempDirectory("kactoos-2")
        val path = temp.resolve("a/b/c/file.txt")
        val txt = "Hello, друг!"
        LengthOf(
            TeeInput(txt, SyncOutput(OutputTo(path.toFile())))
        ).toInt()
        MatcherAssert.assertThat(
            "Can't write file content",
            InputOf(path.toFile()),
            InputHasContent(txt)
        )
    }
}
