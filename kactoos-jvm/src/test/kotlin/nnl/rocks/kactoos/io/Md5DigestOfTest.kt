
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.HexOf
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for [Md5DigestOf].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 53a0d6ea22621a448497f1aa6daf621c8f9ff145 $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class Md5DigestOfTest {

    @Test
    @Throws(IOException::class)
    fun checksumOfEmptyString() {
        MatcherAssert.assertThat(
                "Can't calculate the empty string's MD5 checksum",
                HexOf(
                        Md5DigestOf(
                                InputOf("")
                        )
                ),
                TextHasString(
                        "d41d8cd98f00b204e9800998ecf8427e"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checksumOfString() {
        MatcherAssert.assertThat(
                "Can't calculate the string's MD5 checksum",
                HexOf(
                        Md5DigestOf(
                                InputOf("Hello World!")
                        )
                ),
                TextHasString(
                        "ed076287532e86365e841e92bfc50d8c"
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checksumFromFile() {
        MatcherAssert.assertThat(
                "Can't calculate the file's MD5 checksum",
                HexOf(
                        Md5DigestOf(
                                InputOf(
                                        ResourceOf(
                                                "org/cactoos/io/DigestEnvelope.class"
                                        ).stream()
                                )
                        )
                ),
                TextHasString(
                        "842a5e7012d76e1df96c3d92e5c661df"
                )
        )
    }
}
