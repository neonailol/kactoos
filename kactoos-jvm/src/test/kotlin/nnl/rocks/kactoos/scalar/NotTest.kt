
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Not].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: c05f0dd4e8335a140149f6e344c4315d3d1d1750 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class NotTest {

    @Test
    @Throws(Exception::class)
    fun trueToFalse() {
        MatcherAssert.assertThat(
                Not(True()).value(),
                Matchers.equalTo(False().value())
        )
    }

    @Test
    @Throws(Exception::class)
    fun falseToTrue() {
        MatcherAssert.assertThat(
                Not(False()).value(),
                Matchers.equalTo(True().value())
        )
    }
}
