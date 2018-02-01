
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [TrimmedRightText].
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: ab09a45d06e31173a66e22ff0fbe9681ae906df4 $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class TrimmedRightTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
                "Can't right trim a text",
                TrimmedRightText(TextOf("  Hello!   \t ")),
                TextHasString("  Hello!")
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        MatcherAssert.assertThat(
                "Can't trim a blank text",
                TrimmedRightText(TextOf("  \t ")),
                TextHasString("")
        )
    }
}
