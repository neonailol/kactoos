package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [StickyBiFunc].
 *
 *
 * @since 0.13
 *
 */
class StickyBiFuncTest {

    @Test
    @Throws(Exception::class)
    fun cachesFuncResults() {
        val func = StickyBiFunc<Boolean, Boolean, Int>(BiFuncOf { first, second -> SecureRandom().nextInt() })
        MatcherAssert.assertThat(
            func.apply(true, true) + func.apply(true, true),
            Matchers.equalTo(func.apply(true, true) + func.apply(true, true))
        )
    }
}
