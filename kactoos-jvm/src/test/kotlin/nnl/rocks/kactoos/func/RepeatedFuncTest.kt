package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.iterator.StickyIterator
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [RepeatedFunc].
 *
 *
 *
 * @since 0.13.1
 *
 *
 */
class RepeatedFuncTest {

    @Test
    @Throws(Exception::class)
    fun runsFuncMultipleTimes() {
        val iter = StickyIterator(1, 2, 5, 6)
        val func = RepeatedFunc<Boolean, Int>(
            FuncOf { input -> iter.next() },
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
            FuncOf { 0 },
            2
        )
        MatcherAssert.assertThat(
            func.apply(true),
            Matchers.equalTo(0)
        )
    }

    @Test(expected = IllegalArgumentException::class)
    @Throws(Exception::class)
    fun doesntRepeatAny() {
        val func = RepeatedFunc<Boolean, Int>(
            FuncOf { input -> SecureRandom().nextInt() },
            0
        )
        MatcherAssert.assertThat(
            func.apply(true),
            Matchers.equalTo(func.apply(true))
        )
    }
}
