

package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.io.BytesOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.util.Base64

/**
 * Test case for [nnl.rocks.kactoos.bytes.Base64Bytes].
 *
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 9e6654d2422f73a7dafed8e5403e6f7e47ef2793 $
 * @since 0.20.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class Base64BytesTest {

    @Test
    @Throws(IOException::class)
    fun checkDecodeBasicDecoder() {
        MatcherAssert.assertThat(
                "Can't decodes bytes using the Base64 encoding basic scheme.",
                Base64Bytes(
                        BytesOf(
                                "SGVsbG8h"
                        )
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf("Hello!").asBytes()
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checkDecodeUrlDecoder() {
        MatcherAssert.assertThat(
                "Can't decodes bytes using the Base64 encoding url scheme",
                Base64Bytes(
                        BytesOf(
                                "SGVsbG8h"
                        ), Base64.getUrlDecoder()
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf("Hello!").asBytes()
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checkDecodeMimeDecoder() {
        MatcherAssert.assertThat(
                "Can't decodes bytes using the Base64 encoding mime scheme",
                Base64Bytes(
                        BytesOf(
                                "SGVsbG8h"
                        ), Base64.getMimeDecoder()
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf("Hello!").asBytes()
                )
        )
    }
}
