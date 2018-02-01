
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for [NormalizedText].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: f6900a66327a665893998b85d55df47b88b1a2a0 $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class NormalizedTextTest {

    @Test
    @Throws(IOException::class)
    fun normalizesText() {
        MatcherAssert.assertThat(
                "Can't normalize a text",
                NormalizedText(" \t hello  \t\tworld   \t"),
                TextHasString("hello world")
        )
    }
}
