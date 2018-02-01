package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.iterable.Limited
import nnl.rocks.kactoos.iterable.RangeOf
import nnl.rocks.kactoos.iterable.Skipped
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Skipped].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: f2cde36b382f9785aa4d6c933c1f6c0e93145e75 $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class ReducedTest {

    @Test
    @Throws(Exception::class)
    fun skipIterable() {
        MatcherAssert.assertThat(
            "Can't reduce elements in iterable",
            Reduced(
                0L, { first, second -> first + second },
                Limited(
                    10,
                    RangeOf(0L, java.lang.Long.MAX_VALUE, { value -> value + 1 })
                )
            ).value(),
            Matchers.equalTo(45L)
        )
    }
}
