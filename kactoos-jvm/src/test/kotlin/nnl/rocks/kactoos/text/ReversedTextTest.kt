
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [ReversedText].
 *
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 960974c1cb34751cb0afe6981726ff2c4f699f96 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ReversedTextTest {

    @Test
    fun reverseText() {
        MatcherAssert.assertThat(
                "Can't reverse a text",
                ReversedText(
                        TextOf("Hello!")
                ),
                TextHasString("!olleH")
        )
    }

    @Test
    fun reversedEmptyTextIsEmptyText() {
        MatcherAssert.assertThat(
                "Can't reverse empty text",
                ReversedText(
                        TextOf("")
                ),
                TextHasString("")
        )
    }
}
