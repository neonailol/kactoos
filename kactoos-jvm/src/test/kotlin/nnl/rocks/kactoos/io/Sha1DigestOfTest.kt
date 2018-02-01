
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.HexOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for [Sha1DigestOf].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: e06a5a9b29d291d1ba0a06f7ecbc3e79d2f4e796 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class Sha1DigestOfTest {

    @Test
    @Throws(IOException::class)
    fun checksumOfEmptyString() {
        MatcherAssert.assertThat(
                "Can't calculate the empty string's SHA-1 checksum",
                HexOf(
                        Sha1DigestOf(
                                InputOf("")
                        )
                ),
                TextHasString(
                        "da39a3ee5e6b4b0d3255bfef95601890afd80709"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checksumOfString() {
        MatcherAssert.assertThat(
                "Can't calculate the string's SHA-1 checksum",
                HexOf(
                        Sha1DigestOf(
                                InputOf("Hello World!")
                        )
                ),
                TextHasString(
                        "2ef7bde608ce5404e97d5f042f95f89f1c232871"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checksumFromFile() {
        MatcherAssert.assertThat(
                "Can't calculate the file's SHA-1 checksum",
                HexOf(
                        Sha1DigestOf(
                                InputOf(
                                        ResourceOf(
                                                "org/kactoos/io/DigestEnvelope.class"
                                        ).stream()
                                )
                        )
                ),
                TextHasString(
                        "9d47e35afdcbf845aa9f05f15b4d936b97e55f0e"
                )
        )
    }
}
