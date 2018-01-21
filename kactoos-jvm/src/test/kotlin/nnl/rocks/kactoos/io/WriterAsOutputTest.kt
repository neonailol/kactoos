package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.TextHasString
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
 *
 *
 * @since 0.13
 *
 *
 */
class WriterAsOutputTest {

    @Test
    @Throws(IOException::class)
    fun writesLargeContentToFile() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        MatcherAssert.assertThat(
            "Can't copy Input to Output and return Input",
            TextOf(
                TeeInput(
                    ResourceOf("nnl/rocks/kactoos/large-text.txt"),
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
