package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.func.BiFuncOf
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.Limited
import nnl.rocks.kactoos.iterable.RangeOf
import nnl.rocks.kactoos.iterable.Skipped
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Skipped].
 *
 *
 * @since 0.9
 *
 *
 */
class ReducedTest {

    @Test
    @Throws(Exception::class)
    fun skipIterable() {
        var value = 0L
        MatcherAssert.assertThat(
            "Can't reduce elements in iterable",
            Reduced(
                0L, BiFuncOf { first, second -> first + second },
                Limited(
                    10,
                    RangeOf(0L, java.lang.Long.MAX_VALUE, FuncOf { it -> ++ value })
                )
            ).value(),
            Matchers.equalTo(45L)
        )
    }
}
