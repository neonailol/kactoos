package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.list.ListOf
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
            "Can't behave as a collection",
            Shuffled(ListOf(1, 2, 0, - 1)),
            BehavesAsCollection(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun shufflesCollection() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in collection",
            Shuffled(ListOf(1, 2, 0, - 1)),
            Matchers.hasItem(- 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun shufflesArray() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in array",
            Shuffled(1, 2, 0, - 1),
            Matchers.hasItem(- 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun shufflesIterable() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in iterable",
            Shuffled(IterableOf(1, 2, 0, - 1)),
            Matchers.hasItem(- 1)
        )
    }
}
