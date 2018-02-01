
package nnl.rocks.kactoos.list

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [Shuffled].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 8314b5f8da13891e57d4fb640dc7c83dbb7b0de5 $
 * @since 0.23
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ShuffledTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a list",
                ListNoNulls(
                        Shuffled(
                                ListOf(1, 0, - 1, - 1, 2)
                        )
                ),
                BehavesAsList(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun shufflesList() {
        MatcherAssert.assertThat(
                "Can't shuffle elements in list",
                Shuffled(
                        ListOf(1, 0, - 1, - 1, 2)
                ),
                Matchers.hasItem(- 1)
        )
    }
}
