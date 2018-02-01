
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.ByteArrayOutputStream
import java.nio.charset.StandardCharsets

/**
 * Test case for [TeeOutput].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 74f34ad8f267876a50d2d9d8b7d9d33e46294370 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
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
                        MatcherOf { str ->
                            String(
                                    copy.toByteArray(), StandardCharsets.UTF_8
                            ) == str
                        }
                )
        )
    }
}
