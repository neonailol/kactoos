
package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.NoSuchElementException

/**
 * Test Case for [Skipped].
 * @author Ilia Rogozhin (ilia.rogozhin@gmail.com)
 * @version $Id: 929a38b81aa6b1e23ddc193591a2cdfc35f105f8 $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SkippedTest {

    @Test
    @Throws(Exception::class)
    fun skipIterator() {
        MatcherAssert.assertThat(
                "Can't skip elements in iterator",
                {
                    Skipped(
                            2,
                            IterableOf(
                                    "one", "two", "three", "four"
                            ).iterator()
                    )
                },
                Matchers.contains(
                        "three",
                        "four"
                )
        )
    }

    @Test(expected = NoSuchElementException::class)
    @Throws(Exception::class)
    fun errorSkippedMoreThanExists() {
        Skipped(
                2,
                IterableOf(
                        "one", "two"
                ).iterator()
        ).next()
    }
}
