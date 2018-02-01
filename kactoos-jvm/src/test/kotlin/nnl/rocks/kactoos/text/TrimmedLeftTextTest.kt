
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [TrimmedLeftText].
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 173ec5052ace40e0d75b805b76e1c3d79da757d2 $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class TrimmedLeftTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
                "Can't left trim a text",
                TrimmedLeftText(TextOf("  Hello!   \t ")),
                TextHasString("Hello!   \t ")
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        MatcherAssert.assertThat(
                "Can't trim a blank text",
                TrimmedLeftText(TextOf("  \t ")),
                TextHasString("")
        )
    }
}
