package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.io.BytesOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [nnl.rocks.kactoos.bytes.Base64Bytes].
 *
 *
 *
 * @since 0.20.2
 */
class Base64BytesTest {

    /**
     * Check bytes decodes using the Base64 encoding scheme.
     * @throws IOException If fails.
     */
    @Test
    @Throws(IOException::class)
    fun checkDecode() {
        MatcherAssert.assertThat(
            "Can't decodes bytes using the Base64 encoding scheme",
            Base64Bytes(BytesOf("SGVsbG8h")).asBytes(),
            Matchers.equalTo(BytesOf("Hello!").asBytes())
        )
    }
}
