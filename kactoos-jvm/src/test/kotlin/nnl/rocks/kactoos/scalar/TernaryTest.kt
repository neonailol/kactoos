package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Ternary].
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 464f79bfd2ce1dc34d279e231cdf650fa64a6559 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class TernaryTest {

    @Test
    @Throws(Exception::class)
    fun conditionTrue() {
        MatcherAssert.assertThat(
            Ternary<Int, Any>(
                True(),
                6,
                16
            ).value(),
            Matchers.equalTo(6)
        )
    }

    @Test
    @Throws(Exception::class)
    fun conditionFalse() {
        MatcherAssert.assertThat(
            Ternary<Int, Any>(
                False(),
                6,
                16
            ).value(),
            Matchers.equalTo(16)
        )
    }

    @Test
    @Throws(Exception::class)
    fun conditionBoolean() {
        MatcherAssert.assertThat(
            Ternary<Int, Any>(
                true,
                6,
                16
            ).value(),
            Matchers.equalTo(6)
        )
    }

    @Test
    @Throws(Exception::class)
    fun conditionFunc() {
        MatcherAssert.assertThat(
            Ternary(
                5,
                { input -> input > 3 },
                { input -> 8 },
                { input -> 2 }
            ).value(),
            Matchers.equalTo(8)
        )
    }
}
