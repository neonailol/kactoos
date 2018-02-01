
package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException
import java.util.Collections

/**
 * Test Case for [ItemAt].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 4d199219833ab17de1d04be7ab57efbcf0f352ea $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ItemAtTest {

    @Test
    @Throws(Exception::class)
    fun firstElementTest() {
        MatcherAssert.assertThat(
                "Can't take the first item from the iterator",
                ItemAt(
                        // @checkstyle MagicNumber (1 line)
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
                        // @checkstyle MagicNumber (1 line)
                        IterableOf(1, 2, 3).iterator(),
                        1
                ),
                ScalarHasValue(2)
        )
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForEmptyCollectionTest() {
        ItemAt(Collections.emptyIterator()).value()
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForNegativePositionTest() {
        ItemAt(
                // @checkstyle MagicNumber (1 line)
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
                ItemAt<String>(
                        Collections.emptyIterator<Any>(),
                        fallback
                ),
                ScalarHasValue(fallback)
        )
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun failForPosMoreLengthTest() {
        ItemAt(
                // @checkstyle MagicNumberCheck (2 lines)
                IterableOf(1, 2, 3).iterator(),
                3
        ).value()
    }
}
