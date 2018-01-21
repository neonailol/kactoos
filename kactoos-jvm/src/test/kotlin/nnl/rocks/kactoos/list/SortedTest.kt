package nnl.rocks.kactoos.list

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.Comparator

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
            "Can't behave as a list",
            Sorted(
                ListOf(1, 0, - 1, - 1, 2)
            ),
            BehavesAsList(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun sortsCollection() {
        MatcherAssert.assertThat(
            "Can't sort elements in list",
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

    @Test
    @Throws(Exception::class)
    fun takesItemFromSortedList() {
        MatcherAssert.assertThat(
            "Can't take one element from sorted list",
            Sorted(
                Comparator.reverseOrder(),
                "alpha", "beta", "gamma", "delta"
            )[1],
            Matchers.equalTo("delta")
        )
    }
}
