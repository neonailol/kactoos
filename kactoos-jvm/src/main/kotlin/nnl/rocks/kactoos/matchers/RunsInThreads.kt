package nnl.rocks.kactoos.matchers

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.scalar.And
import nnl.rocks.kactoos.scalar.UncheckedScalar
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher
import java.util.ArrayList
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.Future

/**
 * Matcher for [Func] that must run in multiple threads.
 *
 * @param input Input object
 * @param T Type of input
 * @since 0.3
 */
class RunsInThreads<T : Any> @JvmOverloads constructor(
    private val input: T? = null,
    private val total: Int = Runtime.getRuntime().availableProcessors() shl 4
) : TypeSafeMatcher<Func<T, Boolean>>() {

    public override fun matchesSafely(func: Func<T, Boolean>): Boolean {
        val service = Executors.newFixedThreadPool(
            this.total
        )
        val latch = CountDownLatch(1)
        val futures = ArrayList<Future<Boolean>>(this.total)
        val task = {
            latch.await()
            func.apply(this.input !!)
        }
        for (thread in 0 until this.total) {
            futures.add(service.submit(task))
        }
        latch.countDown()
        val matches = UncheckedScalar(
            And(
                FuncOf<Future<Boolean>, Boolean> { it.get() } as Func<Future<Boolean>, Boolean>,
                futures
            )
        ).value()
        service.shutdown()
        return matches
    }

    override fun describeTo(description: Description) {
        description.appendText("failed")
    }
}
