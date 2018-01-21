package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException

/**
 * Test case for  [nnl.rocks.kactoos.text.TextBase64].
 *
 *
 * @since 0.20.2
 */
class TextBase64Test {

    /**
     * Check text encodes using the Base64 encoding scheme.
     * @throws IOException If fails.
     */
    @Test
    @Throws(IOException::class)
    fun checkEncode() {
        MatcherAssert.assertThat(
            "Can't encodes text using the Base64 encoding scheme",
            TextBase64(
                "Hello!"
            ),
            TextHasString(
                "SGVsbG8h"
            )
        )
    }
}
