package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Sorted].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 158e1428a702ade448809cf12a23e43309f3aa55 $
 * @since 0.19
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SortedTest {

    @Test
    @Throws(Exception::class)
    fun sortsIterable() {
        MatcherAssert.assertThat(
            "Can't sort elements in iterator",
            IterableOf(
                Sorted(
                    IterableOf(
                        "one", "two", "three", "four"
                    ).iterator()
                )
            ),
            Matchers.contains(
                "four", "one", "three", "two"
            )
        )
    }
}
