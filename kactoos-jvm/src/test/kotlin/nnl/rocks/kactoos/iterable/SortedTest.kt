
package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.Comparator

/**
 * Test case for [Sorted].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: acc15ea3c48f4dbb8af140293cd50fa6327f367b $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class SortedTest {

    @Test
    @Throws(Exception::class)
    fun sortsAnArray() {
        MatcherAssert.assertThat(
                "Can't sort an iterable",
                Sorted(
                        IterableOf(
                                3, 2, 10, 44, - 6, 0
                        )
                ),
                Matchers.hasItems(- 6, 0, 2, 3, 10, 44)
        )
    }

    @Test
    @Throws(Exception::class)
    fun sortsAnArrayWithComparator() {
        MatcherAssert.assertThat(
                "Can't sort an iterable with a comparator",
                Sorted(
                        Comparator.reverseOrder(), IterableOf(
                        "a", "c", "hello", "dude", "Friend"
                )
                ),
                Matchers.hasItems("hello", "dude", "c", "a", "Friend")
        )
    }

    @Test
    @Throws(Exception::class)
    fun sortsAnEmptyArray() {
        MatcherAssert.assertThat(
                "Can't sort an empty iterable",
                Sorted(
                        emptyList<Int>()
                ),
                Matchers.iterableWithSize(0)
        )
    }
}
