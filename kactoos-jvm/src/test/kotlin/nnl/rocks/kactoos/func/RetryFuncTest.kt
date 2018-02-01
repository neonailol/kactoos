
package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [RetryFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 891f51ad523f379feeb3e383b5f4562172a84fae $
 * @since 0.8
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class RetryFuncTest {

    @Test
    @Throws(Exception::class)
    fun runsFuncMultipleTimes() {
        MatcherAssert.assertThat(
                RetryFunc<Any, Int>(
                        { input ->
                            // @checkstyle MagicNumberCheck (1 line)
                            if (SecureRandom().nextDouble() > 0.3) {
                                throw IllegalArgumentException("May happen")
                            }
                            0
                        },
                        Integer.MAX_VALUE
                ).apply(true),
                Matchers.equalTo(0)
        )
    }
}
