
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [WriterTo].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 836bd5a08ef9354183dc9a67d7c6a46940214d2c $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class WriterToTest {

    @Test
    @Throws(IOException::class)
    fun writesLargeContentToFile() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        MatcherAssert.assertThat(
                "Can't copy Input to Output and return Input",
                TextOf(
                        TeeInput(
                                ResourceOf("org/kactoos/large-text.txt"),
                                WriterAsOutput(WriterTo(temp))
                        )
                ),
                TextHasString(
                        MatcherOf { str -> TextOf(temp).asString() == str }
                )
        )
    }
}
