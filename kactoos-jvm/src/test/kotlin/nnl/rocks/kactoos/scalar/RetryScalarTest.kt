
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [RetryScalar].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 738e7b7210b77d4f2ccadc7cdc1d9cdcc5b4651e $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class RetryScalarTest {

    @Test
    @Throws(Exception::class)
    fun runsScalarMultipleTimes() {
        MatcherAssert.assertThat(
                RetryScalar<Int>(
                        {
                            // @checkstyle MagicNumberCheck (1 line)
                            if (SecureRandom().nextDouble() > 0.3) {
                                throw IllegalArgumentException("May happen")
                            }
                            0
                        },
                        Integer.MAX_VALUE
                ).value(),
                Matchers.equalTo(0)
        )
    }
}
