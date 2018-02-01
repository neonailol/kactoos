
package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Limited].
 *
 * @author Dusan Rychnovsky (dusan.rychnovsky@gmail.com)
 * @version $Id: 7c5b054d8483fcce0a5a9c7335926c16e3ee1a83 $
 * @since 0.6
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class LimitedTest {

    @Test
    fun iteratesOverPrefixOfGivenLength() {
        // @checkstyle MagicNumber (7 lines)
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
        // @checkstyle MagicNumber (7 lines)
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
        // @checkstyle MagicNumber (7 lines)
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
        // @checkstyle MagicNumber (7 lines)
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
        // @checkstyle MagicNumber (7 lines)
        MatcherAssert.assertThat(
                "Can't limit an empty iterable",
                Limited(
                        10, IterableOf()
                ),
                Matchers.iterableWithSize<Any>(0)
        )
    }
}
