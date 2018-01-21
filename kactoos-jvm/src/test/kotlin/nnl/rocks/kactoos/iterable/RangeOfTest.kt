package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.collection.CollectionOf
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.time.LocalDate
import java.time.chrono.ChronoLocalDate
import java.time.temporal.ChronoUnit

/**
 * Test of range implementation.
 *
 *
 *
 * @since 1.0
 *
 *
 */
class RangeOfTest {

    @Test
    fun testIntegerRange() {
        var value = 1
        MatcherAssert.assertThat(
            "Can't generate a range of integers",
            CollectionOf(
                RangeOf(1, 5, FuncOf { it -> ++ value })
            ),
            Matchers.contains(1, 2, 3, 4, 5)
        )
    }

    @Test
    fun testIntegerFibonacciRange() {
        MatcherAssert.assertThat(
            "Can't generate a range of fibonacci integers",
            CollectionOf(
                RangeOf(
                    1,
                    100,
                    object : Func<Int, Int> {
                        private var last: Int = 0
                        @Throws(Exception::class)
                        override fun apply(
                            input: Int
                        ): Int {
                            val next = this.last + input
                            this.last = input
                            return next
                        }
                    }
                )
            ),
            Matchers.contains(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
        )
    }

    @Test
    fun testLongRange() {
        var value = 1L
        MatcherAssert.assertThat(
            "Can't generate a range of long",
            CollectionOf(
                RangeOf(
                    1L, 5L, FuncOf { it -> ++ value }
                )
            ), Matchers.contains(1L, 2L, 3L, 4L, 5L)
        )
    }

    @Test
    fun testCharacterRange() {
        var value = 'a'
        MatcherAssert.assertThat(
            "Can't generate a range of characters",
            CollectionOf(
                RangeOf(
                    'a', 'c', FuncOf { it -> ++ value }
                )
            ), Matchers.contains('a', 'b', 'c')
        )
    }

    @Test
    fun testLocalDateRange() {
        MatcherAssert.assertThat<CollectionOf<ChronoLocalDate>>(
            "Can't generate a range of local dates.",
            CollectionOf(
                RangeOf<ChronoLocalDate>(
                    LocalDate.of(2017, 1, 1),
                    LocalDate.of(2017, 1, 3),
                    FuncOf { value -> value.plus(1, ChronoUnit.DAYS) }
                )
            ),
            Matchers.contains<ChronoLocalDate>(
                LocalDate.of(2017, 1, 1),
                LocalDate.of(2017, 1, 2),
                LocalDate.of(2017, 1, 3)
            )
        )
    }
}
