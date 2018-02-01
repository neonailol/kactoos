
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [SumOf].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 3b572ffb44278b553c3f59e9258c01c458c8d0de $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class SumOfTest {

    @Test
    @Throws(Exception::class)
    fun withListOfNumbers() {
        MatcherAssert.assertThat(
                SumOf(1, 2, 3).toInt(),
                Matchers.equalTo(6)
        )
        MatcherAssert.assertThat(
                SumOf(1.0, 2.0, 3.0).toDouble(),
                Matchers.equalTo(6.0)
        )
        MatcherAssert.assertThat(
                SumOf(1.0f, 2.0f, 3.0f).toFloat(),
                Matchers.equalTo(6.0f)
        )
        MatcherAssert.assertThat(
                SumOf(1L, 2L, 3L).toLong(),
                Matchers.equalTo(6L)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withCollection() {
        MatcherAssert.assertThat(
                SumOf(
                        ListOf(1, 2, 3, 4)
                ).toLong(),
                Matchers.equalTo(10L)
        )
        MatcherAssert.assertThat(
                SumOf(
                        ListOf(1L, 2L, 3L, 4L)
                ).toInt(),
                Matchers.equalTo(10)
        )
        MatcherAssert.assertThat(
                SumOf(
                        ListOf(1.0, 2.0, 3.0, 4.0)
                ).toFloat(),
                Matchers.equalTo(10.0f)
        )
        MatcherAssert.assertThat(
                SumOf(
                        ListOf(1.0f, 2.0f, 3.0f, 4.0f)
                ).toDouble(),
                Matchers.equalTo(10.0)
        )
    }
}
