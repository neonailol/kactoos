
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Test case for [WriterAsOutput].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 79be7495f2ad7105f16ad9989f68612a0849c540 $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class WriterAsOutputTest {

    @Test
    @Throws(IOException::class)
    fun writesLargeContentToFile() {
        val temp = Files.createTempFile("cactoos-1", "txt-1")
        MatcherAssert.assertThat(
                "Can't copy Input to Output and return Input",
                TextOf(
                        TeeInput(
                                ResourceOf("org/cactoos/large-text.txt"),
                                WriterAsOutput(
                                        OutputStreamWriter(
                                                FileOutputStream(temp.toFile()),
                                                StandardCharsets.UTF_8
                                        )
                                )
                        )
                ),
                TextHasString(
                        MatcherOf { str -> TextOf(temp).asString() == str }
                )
        )
    }
}
