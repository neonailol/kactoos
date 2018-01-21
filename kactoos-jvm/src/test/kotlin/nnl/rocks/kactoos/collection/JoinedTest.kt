package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Limited].
 *
 *
 *
 * @since 0.16
 *
 *
 */
class JoinedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            Joined(
                IterableOf(1, - 1, 2, 0),
                IterableOf(1, - 1, 2, 0),
                IterableOf(1, - 1, 2, 0)
            ),
            BehavesAsCollection(- 1)
        )
    }

    @Test
    fun size() {
        MatcherAssert.assertThat(
            Joined(
                IterableOf("hello", "world", "друг"),
                IterableOf("how", "are", "you"),
                IterableOf("what's", "up")
            ).size,
            Matchers.equalTo(8)
        )
    }

    @Test
    fun sizeEmptyReturnZero() {
        MatcherAssert.assertThat(
            Joined(
                emptyList<Iterable<String>>()
            ).size,
            Matchers.equalTo(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withItemsNotEmpty() {
        MatcherAssert.assertThat(
            Joined(
                IterableOf("1", "2"),
                IterableOf("3", "4")
            ).isEmpty(),
            Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
            Joined(
                emptyList<Iterable<String>>()
            ).isEmpty(),
            Matchers.equalTo(true)
        )
    }
}
