
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [StickyScalar].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 1e6ef25b0cb50876984e8a6e85d925241d0a34b8 $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class StickyScalarTest {

    @Test
    @Throws(Exception::class)
    fun cachesScalarResults() {
        val scalar = StickyScalar<Int>(
                { SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
                scalar.value() + scalar.value(),
                Matchers.equalTo<Int>(scalar.value() + scalar.value())
        )
    }
}
