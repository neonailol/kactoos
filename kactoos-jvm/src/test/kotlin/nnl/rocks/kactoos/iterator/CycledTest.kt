
package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableNoNulls
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.util.Collections
import java.util.NoSuchElementException

/**
 * Test Case for [Cycled].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 27ade7f37b17f73e1150526e8a9f8714a3a9e3a9 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class CycledTest {

    @Test
    @Throws(Exception::class)
    fun repeatIteratorTest() {
        val expected = "two"
        MatcherAssert.assertThat(
                "Can't repeat iterator",
                ItemAt(
                        Cycled(
                                IterableNoNulls(
                                        IterableOf(
                                                "one", expected, "three"
                                        )
                                )
                        ),
                        // @checkstyle MagicNumberCheck (1 line)
                        7
                ),
                ScalarHasValue(
                        expected
                )
        )
    }

    @Test(expected = NoSuchElementException::class)
    @Throws(Exception::class)
    fun notCycledEmptyTest() {
        Cycled(
                Iterable<Any> { Collections.emptyIterator() }
        ).next()
    }
}
