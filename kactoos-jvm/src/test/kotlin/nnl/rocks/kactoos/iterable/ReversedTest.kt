
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.JoinedText
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [Reversed].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 86a97d44a0d2b2a2ef57d0622e17811c2e2c507b $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ReversedTest {

    @Test
    fun reversesIterable() {
        MatcherAssert.assertThat(
                "Can't reverse an iterable",
                JoinedText(
                        " ",
                        Reversed(
                                IterableOf(
                                        "hello", "world", "dude"
                                )
                        )
                ),
                TextHasString("dude world hello")
        )
    }
}
