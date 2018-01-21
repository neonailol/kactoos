package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Not].
 *
 *
 *
 * @since 0.7
 *
 */
class NotTest {

    @Test
    @Throws(Exception::class)
    fun trueToFalse() {
        MatcherAssert.assertThat(
            Not(True()).value(),
            Matchers.equalTo(False().value())
        )
    }

    @Test
    @Throws(Exception::class)
    fun falseToTrue() {
        MatcherAssert.assertThat(
            Not(False()).value(),
            Matchers.equalTo(True().value())
        )
    }
}
