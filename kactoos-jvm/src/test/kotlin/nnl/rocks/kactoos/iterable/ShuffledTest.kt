package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Shuffled].
 *
 *
 *
 * @since 0.20
 *
 *
 */
class ShuffledTest {

    @Test
    @Throws(Exception::class)
    fun shuffleArray() {
        MatcherAssert.assertThat(
            "Can't shuffle an iterable",
            Shuffled(
                IterableOf(
                    6, 2, 5
                )
            ),
            Matchers.containsInAnyOrder(2, 5, 6)
        )
    }
}
