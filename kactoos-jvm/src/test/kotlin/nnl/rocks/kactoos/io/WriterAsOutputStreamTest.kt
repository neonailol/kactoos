package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Test case for [WriterAsOutputStream].
 *
 *
 *
 * @since 0.13
 *
 *
 */
class WriterAsOutputStreamTest {

    @Test
    fun writesToByteArray() {
        val baos = ByteArrayOutputStream()
        val content = "Hello, товарищ! How are you?"
        MatcherAssert.assertThat(
            "Can't copy Input to Writer",
            TextOf(
                TeeInput(
                    InputOf(content),
                    OutputTo(
                        WriterAsOutputStream(
                            OutputStreamWriter(
                                baos, StandardCharsets.UTF_8
                            ),
                            StandardCharsets.UTF_8,
                            13
                        )
                    )
                )
            ),
            TextHasString(
                MatcherOf(
                    FuncOf { str ->
                        String(
                            baos.toByteArray(), StandardCharsets.UTF_8
                        ) == str
                    }
                )
            )
        )
    }

    @Test
    @Throws(IOException::class)
    fun writesLargeContentToFile() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        MatcherAssert.assertThat(
            "Can't copy Input to Output and return Input",
            TextOf(
                TeeInput(
                    ResourceOf("nnl/rocks/kactoos/large-text.txt"),
                    OutputTo(
                        WriterAsOutputStream(
                            OutputStreamWriter(
                                FileOutputStream(temp.toFile()),
                                StandardCharsets.UTF_8
                            ),
                            StandardCharsets.UTF_8,
                            345
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
