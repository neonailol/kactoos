
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [LowerText].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 1138d96c6bba73a38c2bc7fd75c05c1d0ca497b2 $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class LowerTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
                "Can't lower case a text",
                LowerText(TextOf("HelLo!")),
                TextHasString("hello!")
        )
    }
}
