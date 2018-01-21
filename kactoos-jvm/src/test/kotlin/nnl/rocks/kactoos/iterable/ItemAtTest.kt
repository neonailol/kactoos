package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException

/**
 * Test case for [ItemAt].
 *
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
            "Can't take the first item from the iterable",
            ItemAt(
                IterableOf(1, 2, 3)
            ),
            ScalarHasValue(1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun elementByPosTest() {
        MatcherAssert.assertThat(
            "Can't take the item by position from the iterable",
            ItemAt(
                1, IterableOf(1, 2, 3)
            ),
            ScalarHasValue(2)
        )
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForEmptyCollectionTest() {
        ItemAt(emptyList()).value()
    }

    @Test
    @Throws(Exception::class)
    fun fallbackTest() {
        val fallback = "fallback"
        MatcherAssert.assertThat(
            "Can't fallback to default value",
            ItemAt(
                fallback, emptyList()
            ),
            ScalarHasValue(fallback)
        )
    }
}
