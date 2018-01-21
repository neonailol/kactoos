package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [StickyScalar].
 *
 *
 *
 * @since 0.4
 *
 */
class StickyScalarTest {

    @Test
    @Throws(Exception::class)
    fun cachesScalarResults() {
        val scalar = StickyScalar(
            ScalarOf { SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
            scalar.value() + scalar.value(),
            Matchers.equalTo(scalar.value() + scalar.value())
        )
    }
}
