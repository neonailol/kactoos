
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [OutputStreamTo].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 8b382ae292df631f2ee82df14b1f307d7c92cbc8 $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class OutputStreamToTest {

    @Test
    @Throws(IOException::class)
    fun writesLargeContentToFile() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        MatcherAssert.assertThat(
                "Can't copy Input to Output and return Input",
                TextOf(
                        TeeInput(
                                ResourceOf("org/kactoos/large-text.txt"),
                                OutputTo(OutputStreamTo(temp))
                        )
                ),
                TextHasString(
                        MatcherOf { str -> TextOf(temp).asString() == str }
                )
        )
    }
}
