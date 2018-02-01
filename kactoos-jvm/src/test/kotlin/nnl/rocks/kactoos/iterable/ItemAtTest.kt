
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for [ItemAt].
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: 53777c9841bd276284445070b80166bc44401493 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ItemAtTest {

    @Test
    @Throws(Exception::class)
    fun firstElementTest() {
        MatcherAssert.assertThat(
                "Can't take the first item from the iterable",
                ItemAt(
                        // @checkstyle MagicNumber (1 line)
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
                        // @checkstyle MagicNumber (1 line)
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
                ItemAt<String>(
                        fallback, emptyList<String>()
                ),
                ScalarHasValue(fallback)
        )
    }
}
