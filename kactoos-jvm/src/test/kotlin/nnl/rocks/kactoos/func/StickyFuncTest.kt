
package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [StickyFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 7f6224ef58bc4b4dc00b9db6313e4488e3360a6b $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class StickyFuncTest {

    @Test
    @Throws(Exception::class)
    fun cachesFuncResults() {
        val func = StickyFunc<Boolean, Int>(
                FuncOf{ input -> SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
                func.apply(true) + func.apply(true),
                Matchers.equalTo<Int>(func.apply(true) + func.apply(true))
        )
    }

    @Test
    @Throws(Exception::class)
    fun cachesWithLimitedBuffer() {
        val func = StickyFunc<Int, Int>(
            FuncOf{ input -> SecureRandom().nextInt() }, 2
        )
        val first = func.apply(0)
        val second = func.apply(1)
        MatcherAssert.assertThat(
                first + second,
                Matchers.equalTo(func.apply(0) + func.apply(1))
        )
        val third = func.apply(- 1)
        MatcherAssert.assertThat(
                second + third,
                Matchers.equalTo(func.apply(1) + func.apply(- 1))
        )
    }

    @Test
    @Throws(Exception::class)
    fun cachesWithZeroBuffer() {
        val func = StickyFunc<Boolean, Int>(
            FuncOf{ input -> SecureRandom().nextInt() }, 0
        )
        MatcherAssert.assertThat(
                func.apply(true) + func.apply(true),
                Matchers.not(Matchers.equalTo(func.apply(true) + func.apply(true)))
        )
    }
}
