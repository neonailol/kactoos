
package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.matchers.FuncApplies
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [FuncWithFallback].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 7e0aafabf29801151b485a24cce64dea812260e7 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class FuncWithFallbackTest {

    @Test
    @Throws(Exception::class)
    fun usesMainFunc() {
        MatcherAssert.assertThat(
                "Can't use the main function if no exception",
                FuncWithFallback<Any, Any>(
                        { input -> "It's success" },
                        { ex -> "In case of failure..." }
                ),
                FuncApplies(1, Matchers.containsString("success"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun usesFallback() {
        MatcherAssert.assertThat(
                "Can't use the callback in case of exception",
                FuncWithFallback<Any, Any>(
                        { input -> throw IOException("Failure") },
                        { ex -> "Never mind" }
                ),
                FuncApplies(1, Matchers.containsString("Never"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun usesFollowUp() {
        MatcherAssert.assertThat(
                "Can't use the follow-up func",
                FuncWithFallback<Any, Any>(
                        { input -> "works fine" },
                        { ex -> "won't happen" },
                        { input -> "follow up" }
                ),
                FuncApplies(1, Matchers.containsString("follow"))
        )
    }
}
