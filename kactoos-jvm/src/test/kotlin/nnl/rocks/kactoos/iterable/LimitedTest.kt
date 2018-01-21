package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Limited].
 *
 *
 *
 * @since 0.6
 *
 */
class LimitedTest {

    @Test
    fun iteratesOverPrefixOfGivenLength() {
        MatcherAssert.assertThat(
            "Can't limit an iterable with more items",
            Limited(
                3, IterableOf(0, 1, 2, 3, 4)
            ),
            Matchers.contains(0, 1, 2)
        )
    }

    @Test
    fun iteratesOverWholeIterableIfThereAreNotEnoughItems() {
        MatcherAssert.assertThat(
            "Can't limit an iterable with less items",
            Limited(
                10, IterableOf(0, 1, 2, 3, 4)
            ),
            Matchers.contains(0, 1, 2, 3, 4)
        )
    }

    @Test
    fun limitOfZeroProducesEmptyIterable() {
        MatcherAssert.assertThat(
            "Can't limit an iterable to zero items",
            Limited(
                0, IterableOf(0, 1, 2, 3, 4)
            ),
            Matchers.iterableWithSize(0)
        )
    }

    @Test
    fun negativeLimitProducesEmptyIterable() {
        MatcherAssert.assertThat(
            "Can't limit an iterable to negative number of items",
            Limited(
                - 1, IterableOf(0, 1, 2, 3, 4)
            ),
            Matchers.iterableWithSize(0)
        )
    }

    @Test
    fun emptyIterableProducesEmptyIterable() {
        MatcherAssert.assertThat(
            "Can't limit an empty iterable",
            Limited(
                10, IterableOf()
            ),
            Matchers.iterableWithSize<Any>(0)
        )
    }
}
