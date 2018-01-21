package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Shuffled].
 *
 *
 * @since 0.20
 *
 */
class ShuffledTest {

    @Test
    @Throws(Exception::class)
    fun shuffleIterable() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in iterator",
            Iterable {
                Shuffled(
                    IterableOf(
                        "a", "b"
                    ).iterator()
                )
            },
            Matchers.containsInAnyOrder(
                "a", "b"
            )
        )
    }
}
