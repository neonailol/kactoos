package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Sorted].
 *
 *
 * @since 0.19
 *
 */
class SortedTest {

    @Test
    @Throws(Exception::class)
    fun sortsIterable() {
        MatcherAssert.assertThat(
            "Can't sort elements in iterator",
            Iterable {
                Sorted(
                    IterableOf(
                        "one", "two", "three", "four"
                    ).iterator()
                )
            },
            Matchers.contains(
                "four", "one", "three", "two"
            )
        )
    }
}
