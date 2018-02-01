
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [False].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 55b14236b6bb742fcb5180a76f35fe01cdf94478 $
 * @since 0.7
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class FalseTest {

    @Test
    @Throws(Exception::class)
    fun asValue() {
        MatcherAssert.assertThat(
                False().value(),
                Matchers.equalTo(false)
        )
    }
}
