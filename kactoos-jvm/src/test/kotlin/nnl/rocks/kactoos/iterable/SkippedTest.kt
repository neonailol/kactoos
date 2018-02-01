
package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Skipped].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 3cef189b14ab6466218199c9ccffb3afdc3e6274 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SkippedTest {

    @Test
    @Throws(Exception::class)
    fun skipIterable() {
        MatcherAssert.assertThat(
                "Can't skip elements in iterable",
                Skipped(
                        2, IterableOf(
                        "one", "two", "three", "four"
                )
                ),
                Matchers.contains(
                        "three",
                        "four"
                )
        )
    }
}
