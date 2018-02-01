package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.list.ListOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.security.SecureRandom

/**
 * Test case for [SolidFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 73bc73afcaa2990f30dcf74e481da43c31f302e2 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SolidFuncTest {

    @Test
    @Throws(Exception::class)
    fun cachesFuncResults() {
        val func = SolidFunc<Boolean, Int>(
            FuncOf { input -> SecureRandom().nextInt() }
        )
        MatcherAssert.assertThat(
            func.apply(true) + func.apply(true),
            Matchers.equalTo(func.apply(true) + func.apply(true))
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
            "Can't work well in multiple threads",
            FuncOf { func ->
                MatcherAssert.assertThat(
                    func.apply(true),
                    Matchers.equalTo(func.apply(true))
                )
                true
            },
            RunsInThreads(
                SolidFunc(FuncOf { x: Boolean -> ListOf(1, 2) })
            )
        )
    }
}
