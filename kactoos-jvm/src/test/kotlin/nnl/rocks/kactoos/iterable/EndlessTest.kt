
package nnl.rocks.kactoos.iterable

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Endless].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 2ab387d091d24ad8bc905e8201d155a2fb0b3730 $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class EndlessTest {

    @Test
    @Throws(Exception::class)
    fun endlessIterableTest() {
        MatcherAssert.assertThat(
                "Can't get unique endless iterable item",
                Endless(1),
                Matchers.hasItem(1)
        )
    }
}
