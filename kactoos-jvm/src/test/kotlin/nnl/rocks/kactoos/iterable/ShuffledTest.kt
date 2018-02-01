
package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Shuffled].
 *
 * @author Ivan Shcherbak (alotofall@gmail.com)
 * @version $Id: afebb3f49441d5e7cebc74b47fb735113a8db75a $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class ShuffledTest {

    @Test
    @Throws(Exception::class)
    fun shuffleArray() {
        MatcherAssert.assertThat(
                "Can't shuffle an iterable",
                Shuffled(
                        IterableOf(
                                6, 2, 5
                        )
                ),
                Matchers.containsInAnyOrder(2, 5, 6)
        )
    }
}
