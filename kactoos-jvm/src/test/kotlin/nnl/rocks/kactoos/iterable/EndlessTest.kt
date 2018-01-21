package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Endless].
 *
 *
 * @since 0.11
 *
 */
class EndlessTest {

    @Test
    @Throws(Exception::class)
    fun endlessIterableTest() {
        MatcherAssert.assertThat(
            "Can't get unique endless iterable item",
            Endless(1),
            Matchers.hasItem(1)
        )
    }
}
