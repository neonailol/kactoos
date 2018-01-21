package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [RetryScalar].
 *
 *
 *
 * @since 0.9
 *
 */
class RetryScalarTest {

    @Test
    @Throws(Exception::class)
    fun runsScalarMultipleTimes() {
        MatcherAssert.assertThat(
            RetryScalar(
                ScalarOf {
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
