package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.matchers.FuncApplies
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [FuncWithFallback].
 *
 *
 *
 * @since 0.2
 *
 */
class FuncWithFallbackTest {

    @Test
    @Throws(Exception::class)
    fun usesMainFunc() {
        MatcherAssert.assertThat(
            "Can't use the main function if no exception",
            FuncWithFallback(
                (FuncOf<Any, String> { input -> "It's success" }),
                (FuncOf { ex -> "In case of failure..." })
            ),
            FuncApplies(1, Matchers.containsString("success"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun usesFallback() {
        MatcherAssert.assertThat(
            "Can't use the callback in case of exception",
            FuncWithFallback(
                (FuncOf<Any, String> { input -> throw IOException("Failure") }),
                (FuncOf<Any, String> { ex -> "Never mind" })
            ),
            FuncApplies(1, Matchers.containsString("Never"))
        )
    }

    @Test
    @Throws(Exception::class)
    fun usesFollowUp() {
        MatcherAssert.assertThat(
            "Can't use the follow-up func",
            FuncWithFallback(
                FuncOf<Any, String> { input -> "works fine" },
                FuncOf<Any, String> { ex -> "won't happen" },
                FuncOf<Any, String> { input -> "follow up" }
            ),
            FuncApplies(1, Matchers.containsString("follow"))
        )
    }
}
