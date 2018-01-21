package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException
import java.util.Collections

/**
 * Test Case for [ItemAt].
 *
 *
 * @since 0.7
 *
 */
class ItemAtTest {

    @Test
    @Throws(Exception::class)
    fun firstElementTest() {
        MatcherAssert.assertThat(
            "Can't take the first item from the iterator",
            ItemAt(
                IterableOf(1, 2, 3).iterator()
            ),
            ScalarHasValue(1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun elementByPosTest() {
        MatcherAssert.assertThat(
            "Can't take the item by position from the iterator",
            ItemAt(
                IterableOf(1, 2, 3).iterator(),
                1
            ),
            ScalarHasValue(2)
        )
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForEmptyCollectionTest() {
        ItemAt(Collections.emptyIterator<Any>()).value()
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForNegativePositionTest() {
        ItemAt(
            IterableOf(1, 2, 3).iterator(),
            - 1
        ).value()
    }

    @Test
    @Throws(Exception::class)
    fun fallbackTest() {
        val fallback = "fallback"
        MatcherAssert.assertThat(
            "Can't fallback to default value",
            ItemAt(
                Collections.emptyIterator(),
                fallback
            ),
            ScalarHasValue(fallback)
        )
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForPosMoreLengthTest() {
        ItemAt(
            IterableOf(1, 2, 3).iterator(),
            3
        ).value()
    }
}
