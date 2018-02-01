
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.Collections

/**
 * Test Case for [Cycled].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 3202df101d537cc1e140d64a78dd46a6fc2d9b82 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class CycledTest {

    @Test
    @Throws(Exception::class)
    fun repeatIterableTest() {
        val expected = "two"
        MatcherAssert.assertThat(
                "Can't repeat iterable",
                ItemAt(
                        // @checkstyle MagicNumberCheck (1 line)<
                        7, Cycled(
                        IterableOf(
                                "one", expected, "three"
                        )
                )
                ),
                ScalarHasValue(
                        expected
                )
        )
    }

    @Test
    @Throws(Exception::class)
    fun notCycledEmptyTest() {
        MatcherAssert.assertThat(
                "Can't generate an empty iterable",
                LengthOf(
                        Cycled(
                                Iterable { Collections.emptyIterator<Any>() }
                        )
                ).toInt(),
                Matchers.equalTo(0)
        )
    }
}
