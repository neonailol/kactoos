package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [True].
 *
 *
 *
 * @since 0.7
 *
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
