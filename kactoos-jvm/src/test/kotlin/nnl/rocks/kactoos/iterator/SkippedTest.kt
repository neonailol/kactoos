package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.NoSuchElementException

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
    fun skipIterator() {
        MatcherAssert.assertThat(
            "Can't skip elements in iterator",
            Iterable {
                Skipped(
                    2,
                    IterableOf(
                        "one", "two", "three", "four"
                    ).iterator()
                )
            },
            Matchers.contains(
                "three",
                "four"
            )
        )
    }

    @Test(expected = NoSuchElementException::class)
    @Throws(Exception::class)
    fun errorSkippedMoreThanExists() {
        Skipped(
            2,
            IterableOf(
                "one", "two"
            ).iterator()
        ).next()
    }
}
