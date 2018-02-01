

package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test Case for [nnl.rocks.kactoos.text.Base64Text].
 *
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: e800d03fc47bdabd93bf133d4523c7a59355ea5e $
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
