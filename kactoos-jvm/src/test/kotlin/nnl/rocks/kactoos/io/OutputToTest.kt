
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.InputHasContent
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [OutputTo].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 6bfda3134ade1cfdf1ffefe188bbe0cc6cee46f9 $
 * @since 0.15
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class OutputToTest {

    @Test
    @Throws(IOException::class)
    fun writesSimplePathContent() {
        val temp = Files.createTempDirectory("cactoos-1")
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
        val temp = Files.createTempDirectory("cactoos-2")
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
