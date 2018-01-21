package nnl.rocks.kactoos.list

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Shuffled].
 *
 *
 * @since 0.23
 *
 */
class ShuffledTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            ListNoNulls(
                Shuffled(
                    ListOf(1, 0, - 1, - 1, 2)
                )
            ),
            BehavesAsList(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun shufflesList() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in list",
            Shuffled(
                ListOf(1, 0, - 1, - 1, 2)
            ),
            Matchers.hasItem(- 1)
        )
    }
}
