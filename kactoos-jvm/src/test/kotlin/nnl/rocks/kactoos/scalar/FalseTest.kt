package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [False].
 *
 *
 *
 * @since 0.7
 *
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
