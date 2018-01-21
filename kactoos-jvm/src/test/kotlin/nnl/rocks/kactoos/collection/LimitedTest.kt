package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [nnl.rocks.kactoos.collection.Limited].
 *
 *
 *
 * @since 0.16
 *
 *
 */
class LimitedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            Limited(
                2,
                IterableOf(1, - 1, 2, 0)
            ),
            BehavesAsCollection(- 1)
        )
    }

    @Test
    fun size() {
        MatcherAssert.assertThat(
            Limited(
                2,
                IterableOf(
                    "hello", "world", "друг"
                )
            ).size,
            Matchers.equalTo(2)
        )
    }

    @Test
    fun sizeEmptyReturnZero() {
        MatcherAssert.assertThat(
            Limited(
                2,
                emptyList()
            ).size,
            Matchers.equalTo(0)
        )
    }

    @Test
    fun sizeLimitZeroReturnZero() {
        MatcherAssert.assertThat(
            Limited(
                0, IterableOf("1", "2", "3")
            ).size,
            Matchers.equalTo(0)
        )
    }

    @Test
    fun withItemsNotEmpty() {
        MatcherAssert.assertThat(
            Limited(
                2, IterableOf("first", "second")
            ).isEmpty(),
            Matchers.equalTo(false)
        )
    }

    @Test
    fun withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
            Limited(
                0, IterableOf("third", "fourth")
            ).isEmpty(),
            Matchers.equalTo(true)
        )
    }
}
