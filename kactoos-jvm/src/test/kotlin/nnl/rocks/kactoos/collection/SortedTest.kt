
package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Sorted].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 1ef15a71fc0d80035d613d56e5c99a31da46cb14 $
 * @since 0.19
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SortedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a collection",
                Sorted(ListOf(1, 2, 0, - 1)),
                BehavesAsCollection(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun sortsCollection() {
        MatcherAssert.assertThat(
                "Can't sort elements in collection",
                Sorted(
                        ListOf(
                                "one", "two", "three", "four"
                        )
                ),
                Matchers.contains(
                        "four", "one", "three", "two"
                )
        )
    }
}
