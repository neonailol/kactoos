
package nnl.rocks.kactoos.iterator

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Repeated].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: e7afa2d6fa1c4ef1a8b1b255255915278099f5cf $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class RepeatedTest {

    @Test
    @Throws(Exception::class)
    fun allSameTest() {
        val size = 42
        val element = 11
        MatcherAssert.assertThat(
                "Can't generate an iterable with fixed size",
                LengthOf(
                        Repeated(
                                size, element
                        )
                ).toInt(),
                Matchers.equalTo(size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun emptyTest() {
        MatcherAssert.assertThat(
                "Can't generate an empty iterator",
                { Repeated(0, 0) } as Iterable<Int>,
                Matchers.iterableWithSize(0)
        )
    }
}
