package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException

/**
 * Test Case for [nnl.rocks.kactoos.text.Base64Text].
 *
 *
 *
 * @since 0.20.2
 */
class Base64TextTest {

    /**
     * Check text decodes using the Base64 encoding scheme.
     * @throws IOException If fails.
     */
    @Test
    @Throws(IOException::class)
    fun checkDecode() {
        MatcherAssert.assertThat(
            "Can't decodes text using the Base64 encoding scheme",
            Base64Text(
                "SGVsbG8h"
            ),
            TextHasString(
                "Hello!"
            )
        )
    }
}
