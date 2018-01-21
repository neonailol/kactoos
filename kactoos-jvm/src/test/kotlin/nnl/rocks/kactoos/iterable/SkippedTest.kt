package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Skipped].
 *
 *
 * @since 0.8
 *
 */
class SkippedTest {

    @Test
    @Throws(Exception::class)
    fun skipIterable() {
        MatcherAssert.assertThat(
            "Can't skip elements in iterable",
            Skipped(
                2, IterableOf(
                "one", "two", "three", "four"
            )
            ),
            Matchers.contains(
                "three",
                "four"
            )
        )
    }
}
