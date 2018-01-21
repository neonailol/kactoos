package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.nio.charset.StandardCharsets

/**
 * Test case for [TeeOutput].
 *
 *
 * @since 0.16
 *
 *
 */
class TeeOutputTest {

    @Test
    fun copiesContent() {
        val baos = ByteArrayOutputStream()
        val copy = ByteArrayOutputStream()
        val content = "Hello, товарищ!"
        MatcherAssert.assertThat(
            "Can't copy Output to Output and return Input",
            TextOf(
                TeeInput(
                    InputOf(content),
                    TeeOutput(
                        OutputTo(baos),
                        OutputTo(copy)
                    )
                )
            ),
            TextHasString(
                MatcherOf(
                    FuncOf { str ->
                        String(
                            copy.toByteArray(), StandardCharsets.UTF_8
                        ) == str
                    }
                )
            )
        )
    }
}
