
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.MatcherOf
import nnl.rocks.kactoos.matchers.TextHasString
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
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 3f68699a21f1f09712e10531cc0c4f146bdb2be2 $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
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
                                                // @checkstyle MagicNumber (1 line)
                                                13
                                        )
                                )
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
    fun writesLargeContentToFile() {
        val temp = Files.createTempFile("kactoos-1", "txt-1")
        MatcherAssert.assertThat(
                "Can't copy Input to Output and return Input",
                TextOf(
                        TeeInput(
                                ResourceOf("org/kactoos/large-text.txt"),
                                OutputTo(
                                        WriterAsOutputStream(
                                                OutputStreamWriter(
                                                        FileOutputStream(temp.toFile()),
                                                        StandardCharsets.UTF_8
                                                ),
                                                StandardCharsets.UTF_8,
                                                // @checkstyle MagicNumber (1 line)
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
