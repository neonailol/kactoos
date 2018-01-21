package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Test case for [TeeInput].
 *
 *
 * @since 0.1
 *
 *
 */
class TeeInputTest {

    @Test
    fun copiesContent() {
        val baos = ByteArrayOutputStream()
        val content = "Hello, товарищ!"
        MatcherAssert.assertThat(
            "Can't copy Input to Output and return Input",
            TextOf(
                TeeInput(
                    InputOf(content),
                    OutputTo(baos)
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
    fun copiesToFile() {
        val temp = Files.createTempFile("kactoos", "txt")
        MatcherAssert.assertThat(
            "Can't copy Input to File and return content",
            TextOf(
                BytesOf(
                    TeeInput("Hello, друг!", temp)
                )
            ),
            TextHasString(
                MatcherOf(
                    FuncOf { str ->
                        str == String(
                            Files.readAllBytes(temp),
                            StandardCharsets.UTF_8
                        )
                    }
                )
            )
        )
    }
}
