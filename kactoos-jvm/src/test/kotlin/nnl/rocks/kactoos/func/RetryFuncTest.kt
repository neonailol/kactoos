package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [RetryFunc].
 *
 *
 *
 * @since 0.8
 *
 */
class RetryFuncTest {

    @Test
    @Throws(Exception::class)
    fun runsFuncMultipleTimes() {
        MatcherAssert.assertThat(
            RetryFunc<Any, Int>(
                FuncOf { input ->
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
