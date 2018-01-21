package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.test.FuncApplies
import nnl.rocks.kactoos.test.MatcherOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

/**
 * Test case for [AsyncFunc].
 *
 *
 *
 * @since 0.10
 *
 */
class AsyncFuncTest {

    @Test
    fun runsInBackground() {
        MatcherAssert.assertThat(
            "Can't run in the background",
            AsyncFunc(
                FuncOf { input ->
                    TimeUnit.DAYS.sleep(1L)
                    "done!"
                }
            ),
            FuncApplies(
                true,
                MatcherOf<Future<String>> { future -> ! future.isDone }
            )
        )
    }

    @Test
    fun runsAsProcInBackground() {
        MatcherAssert.assertThat<FuncOf<Boolean, Boolean>>(
            "Can't run proc in the background",
            FuncOf { input ->
                val latch = CountDownLatch(1)
                AsyncFunc<Boolean, Any>(
                    FuncOf { ipt: Boolean -> latch.countDown() }
                ).exec(input)
                latch.await()
                true
            },
            FuncApplies(true, Matchers.equalTo(true))
        )
    }

    @Test
    fun runsInBackgroundWithoutFuture() {
        val latch = CountDownLatch(1)
        MatcherAssert.assertThat(
            "Can't run in the background without us touching the Future",
            AsyncFunc(FuncOf { input -> latch.countDown(); "" }),
            FuncApplies(
                true,
                MatcherOf<Future<String>>(FuncOf { future -> latch.await(1L, TimeUnit.SECONDS) })
            )
        )
    }
}
