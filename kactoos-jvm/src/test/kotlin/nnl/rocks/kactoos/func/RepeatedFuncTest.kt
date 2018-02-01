
package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.iterator.StickyIterator
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [RepeatedFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: caf7c7d7276f00dbe23ab28cad09cbb9cf7db62d $
 * @since 0.13.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 line)
 */
class RepeatedFuncTest {

    @Test
    @Throws(Exception::class)
    fun runsFuncMultipleTimes() {
        val iter = StickyIterator(1, 2, 5, 6)
        val func = RepeatedFunc<Boolean, Int>(
                { input -> iter.next() },
                3
        )
        MatcherAssert.assertThat(
                func.apply(true),
                Matchers.equalTo(5)
        )
    }

    @Test
    @Throws(Exception::class)
    fun repeatsNullsResults() {
        val func = RepeatedFunc<Boolean, Int>(
                { input -> null },
                2
        )
        MatcherAssert.assertThat(
                func.apply(true),
                Matchers.equalTo<Int>(null)
        )
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun doesntRepeatAny() {
        val func = RepeatedFunc<Boolean, Int>(
                { input -> SecureRandom().nextInt() },
                0
        )
        MatcherAssert.assertThat(
                func.apply(true),
                Matchers.equalTo<Int>(func.apply(true))
        )
    }
}
