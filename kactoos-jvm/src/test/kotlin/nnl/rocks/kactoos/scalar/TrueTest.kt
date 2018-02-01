
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [True].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 585c89bc70484b9c5b04cba53507e195b7f455d7 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class TrueTest {

    @Test
    @Throws(Exception::class)
    fun asValue() {
        MatcherAssert.assertThat(
                True().value(),
                Matchers.equalTo(true)
        )
    }
}
