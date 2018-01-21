package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf
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
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            Sorted(ListOf(1, 2, 0, - 1)),
            BehavesAsCollection(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun sortsCollection() {
        MatcherAssert.assertThat(
            "Can't sort elements in collection",
            Sorted(
                ListOf(
                    "one", "two", "three", "four"
                )
            ),
            Matchers.contains(
                "four", "one", "three", "two"
            )
        )
    }
}
