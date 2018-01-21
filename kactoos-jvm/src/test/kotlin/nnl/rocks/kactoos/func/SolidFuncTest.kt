package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.security.SecureRandom

/**
 * Test case for [SolidFunc].
 *
 *
 *
 * @since 0.24
 *
 */
class SolidFuncTest {

    @Test
    @Throws(Exception::class)
    fun cachesFuncResults() {
        val func = SolidFunc<Boolean, Int>(FuncOf { input -> SecureRandom().nextInt() })
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
                    Matchers.equalTo<ListOf<Int>>(func.apply(true))
                )
                true
            },
            RunsInThreads(
                SolidFunc<Any, ListOf<Int>>(FuncOf { x -> ListOf(1, 2) })
            )
        )
    }
}
