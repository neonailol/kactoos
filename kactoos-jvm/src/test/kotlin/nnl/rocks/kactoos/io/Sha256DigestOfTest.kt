
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.HexOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for [Sha256DigestOf].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 535e2233750e7c90e571a6950db5c915448626c3 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class Sha256DigestOfTest {

    @Test
    @Throws(IOException::class)
    fun checksumOfEmptyString() {
        MatcherAssert.assertThat(
                "Can't calculate the empty string's SHA-256 checksum",
                HexOf(
                        Sha256DigestOf(
                                InputOf("")
                        )
                ),
                TextHasString(
                        // @checkstyle LineLengthCheck (1 lines)
                        "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checksumOfString() {
        MatcherAssert.assertThat(
                "Can't calculate the string's SHA-256 checksum",
                HexOf(
                        Sha256DigestOf(
                                InputOf("Hello World!")
                        )
                ),
                TextHasString(
                        // @checkstyle LineLengthCheck (1 lines)
                        "7f83b1657ff1fc53b92dc18148a1d65dfc2d4b1fa3d677284addd200126d9069"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checksumFromFile() {
        MatcherAssert.assertThat(
                "Can't calculate the file's SHA-256 checksum",
                HexOf(
                        Sha256DigestOf(
                                InputOf(
                                        ResourceOf(
                                                "org/cactoos/io/DigestEnvelope.class"
                                        ).stream()
                                )
                        )
                ),
                TextHasString(
                        // @checkstyle LineLengthCheck (1 lines)
                        "a56c3be45f9be8dda0653e33ae7ef3abf2939f926eda801f329e0830b6e7cc22"
                )
        )
    }
}
