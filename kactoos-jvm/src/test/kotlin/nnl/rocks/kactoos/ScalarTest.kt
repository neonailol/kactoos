package nnl.rocks.kactoos

import nnl.rocks.kactoos.scalar.ScalarOf
import org.junit.Test

/**
 * Test case for [Scalar].
 *
 *
 * @since 0.11
 *
 */
class ScalarTest {

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        ScalarOf(1).value()
    }
}
