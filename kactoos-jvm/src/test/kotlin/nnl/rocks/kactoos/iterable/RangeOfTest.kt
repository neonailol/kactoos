package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.KFunc
import nnl.rocks.kactoos.collection.CollectionOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.time.LocalDate
import java.time.temporal.ChronoUnit

/**
 * Test of range implementation.
 *
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: b1b7b5bd909ee5261c5187d5a20d92dd58c80645 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
class RangeOfTest {

    @Test
    fun testIntegerRange() {
        MatcherAssert.assertThat(
            "Can't generate a range of integers",
            CollectionOf(
                RangeOf(1, 5, { value -> 1 + value })
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
                    object : KFunc<Int, Int> {
                        private var last: Int = 0
                        @Throws(Exception::class)
                        override fun invoke(
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
        MatcherAssert.assertThat(
            "Can't generate a range of long",
            CollectionOf(
                RangeOf(1L, 5L, { value -> 1 + value })
            ),
            Matchers.contains(1L, 2L, 3L, 4L, 5L)
        )
    }

    @Test
    fun testCharacterRange() {
        MatcherAssert.assertThat(
            "Can't generate a range of characters",
            CollectionOf(
                RangeOf('a', 'c', { value -> value + 1 })
            ),
            Matchers.contains('a', 'b', 'c')
        )
    }

    @Test
    fun testLocalDateRange() {
        MatcherAssert.assertThat(
            "Can't generate a range of local dates.",
            CollectionOf(
                RangeOf(
                    LocalDate.of(2017, 1, 1),
                    LocalDate.of(2017, 1, 3),
                    { value -> value.plus(1, ChronoUnit.DAYS) }
                )
            ),
            Matchers.contains(
                LocalDate.of(2017, 1, 1),
                LocalDate.of(2017, 1, 2),
                LocalDate.of(2017, 1, 3)
            )
        )
    }
}
