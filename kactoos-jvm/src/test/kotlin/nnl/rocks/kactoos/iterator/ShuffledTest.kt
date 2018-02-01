package nnl.rocks.kactoos.iterator

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Shuffled].
 * @author Ivan Shcherbak (alotofall@gmail.com)
 * @version $Id: 908adb0a6a4982c4cd64bca27635ca2342b3b976 $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ShuffledTest {

    @Test
    @Throws(Exception::class)
    fun shuffleIterable() {
        MatcherAssert.assertThat(
            "Can't shuffle elements in iterator",
            IterableOf(
                Shuffled(
                    IterableOf(
                        "a", "b"
                    ).iterator()
                )
            )
            ,
            Matchers.containsInAnyOrder(
                "a", "b"
            )
        )
    }
}
