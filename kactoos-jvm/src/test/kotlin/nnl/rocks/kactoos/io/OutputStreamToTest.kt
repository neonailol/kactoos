package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException
import java.nio.file.Files

/**
 * Test case for [OutputStreamTo].
 *
 *
 *
 * @since 0.13
 *
 *
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
                    ResourceOf("nnl/rocks/kactoos/large-text.txt"),
                    OutputTo(OutputStreamTo(temp))
                )
            ),
            TextHasString(
                MatcherOf(FuncOf { str -> TextOf(temp).asString() == str })
            )
        )
    }
}
