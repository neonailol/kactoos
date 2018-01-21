package nnl.rocks.kactoos

import nnl.rocks.kactoos.func.ProcOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [Proc].
 *
 *
 * @since 0.11
 *
 */
class ProcTest {

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        val counter = AtomicInteger()

        ProcOf { input: AtomicInteger -> input.incrementAndGet() }.exec(counter)
        MatcherAssert.assertThat(
            "Can't involve the \"Proc.exec(X input)\" method",
            counter.get(),
            Matchers.equalTo(1)
        )
    }
}
