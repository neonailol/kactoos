
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [TrimmedText].
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 0858fe3a68709b7f6e2eb6059d79e6f06cd00ab6 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class TrimmedTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
                "Can't trim a text",
                TrimmedText(TextOf("  Hello!   \t ")),
                TextHasString("Hello!")
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        MatcherAssert.assertThat(
                "Can't trim a blank text",
                TrimmedText(TextOf("  \t ")),
                TextHasString("")
        )
    }
}
