
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.ByteArrayOutputStream
import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files

/**
 * Test case for [TeeInput].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 5e93a6dea79740dd643ecb6f92f7e4cef1fb58c5 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
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
                        MatcherOf { str ->
                            String(
                                    baos.toByteArray(), StandardCharsets.UTF_8
                            ) == str
                        }
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun copiesToFile() {
        val temp = Files.createTempFile("cactoos", "txt")
        MatcherAssert.assertThat(
                "Can't copy Input to File and return content",
                TextOf(
                        BytesOf(
                                TeeInput("Hello, друг!", temp)
                        )
                ),
                TextHasString(
                        MatcherOf { str ->
                            str.equals(
                                    String(
                                            Files.readAllBytes(temp),
                                            StandardCharsets.UTF_8
                                    )
                            )
                        }
                )
        )
    }
}
