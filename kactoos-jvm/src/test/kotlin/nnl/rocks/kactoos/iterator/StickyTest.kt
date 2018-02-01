
package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.FormattedText
import nnl.rocks.kactoos.text.JoinedText
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyIterator].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 629943e7098771cb60b5d502e2dfecf7c528cf41 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class StickyTest {

    @Test
    @Throws(Exception::class)
    fun ignoresChangesInIterable() {
        val count = AtomicInteger(2)
        val text = FormattedText(
                "%s",
                JoinedText(
                        ", ",
                        {
                            Mapped<Int, String>(
                                    Func<Int, String> { it.toString() }, StickyIterator(
                                    Limited(
                                            2, Endless(Scalar<Int> { count.incrementAndGet() })
                                    )
                            )
                            )
                        }
                )
        )
        MatcherAssert.assertThat<Text>(
                "Can't ignore the changes in the underlying iterator",
                text,
                TextHasString(text.asString())
        )
    }
}
