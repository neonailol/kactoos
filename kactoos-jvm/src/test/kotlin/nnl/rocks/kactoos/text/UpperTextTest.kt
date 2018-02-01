
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [UpperText].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 96255cadd34bbb9ae69113f757cbcf62847046aa $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UpperTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
                "Can't upper case a text",
                UpperText(TextOf("Hello!")),
                TextHasString("HELLO!")
        )
    }
}
