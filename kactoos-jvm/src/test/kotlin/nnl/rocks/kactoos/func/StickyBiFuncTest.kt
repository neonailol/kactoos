
package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [StickyBiFunc].
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 01b5c086de0b55c5040ee77683371b365e96f29c $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class StickyBiFuncTest {

    @Test
    @Throws(Exception::class)
    fun cachesFuncResults() {
        val func = StickyBiFunc<Boolean, Boolean, Int>(
                { first, second -> SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
                func.apply(true, true) + func.apply(true, true),
                Matchers.equalTo(func.apply(true, true) + func.apply(true, true))
        )
    }
}
