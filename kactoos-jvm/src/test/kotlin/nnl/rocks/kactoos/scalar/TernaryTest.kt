package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Ternary].
 *
 *
 *
 * @since 0.8
 *
 *
 */
class TernaryTest {

    @Test
    @Throws(Exception::class)
    fun conditionTrue() {
        MatcherAssert.assertThat(
            Ternary<Int, Boolean>(
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
            Ternary<Int, Boolean>(
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
            Ternary<Int, Boolean>(
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
                FuncOf { input: Int -> input > 3 },
                FuncOf { input: Int -> 8 },
                FuncOf { input: Int -> 2 }
            ).value(),
            Matchers.equalTo(8)
        )
    }
}
