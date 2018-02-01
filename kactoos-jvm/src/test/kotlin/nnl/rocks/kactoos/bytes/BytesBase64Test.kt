

package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.io.BytesOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.util.Base64

/**
 * Test case for [nnl.rocks.kactoos.bytes.BytesBase64].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: f62ddd0808e4100aef0f9c59047232e726759adb $
 * @since 0.20.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class BytesBase64Test {

    @Test
    @Throws(IOException::class)
    fun checkEncodeBasic() {
        MatcherAssert.assertThat(
                "Can't encodes bytes using the Base64 basic encoding scheme",
                BytesBase64(
                        BytesOf(
                                "Hello!"
                        )
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf("SGVsbG8h").asBytes()
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checkEncodeUrl() {
        MatcherAssert.assertThat(
                "Can't encodes bytes using the Base64 URL encoding scheme",
                BytesBase64(
                        BytesOf(
                                "Hello!"
                        ), Base64.getUrlEncoder()
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf("SGVsbG8h").asBytes()
                )
        )
    }

    @Test
    @Throws(IOException::class)
    fun checkEncodeMime() {
        MatcherAssert.assertThat(
                "Can't encodes bytes using the Base64 mime encoding scheme",
                BytesBase64(
                        BytesOf(
                                "Hello!"
                        ), Base64.getMimeEncoder()
                ).asBytes(),
                Matchers.equalTo(
                        BytesOf("SGVsbG8h").asBytes()
                )
        )
    }
}
