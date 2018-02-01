

package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for  [nnl.rocks.kactoos.text.TextBase64].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 3090aead405171c002be4df590001bd80aead182 $
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
