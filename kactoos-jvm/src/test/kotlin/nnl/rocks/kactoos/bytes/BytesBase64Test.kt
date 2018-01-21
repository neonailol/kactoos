package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.io.BytesOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [nnl.rocks.kactoos.bytes.BytesBase64].
 *
 * @since 0.20.2
 */
class BytesBase64Test {

    /**
     * Check bytes encodes using the Base64 encoding scheme.
     * @throws IOException If fails.
     */
    @Test
    @Throws(IOException::class)
    fun checkEncode() {
        MatcherAssert.assertThat(
            "Can't encodes bytes using the Base64 encoding scheme",
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
}
