package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.test.MatcherOf
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [RunnableOf].
 *
 *
 *
 * @since 0.2
 *
 */
class RunnableOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsFuncIntoRunnable() {
        val done = AtomicBoolean()
        MatcherAssert.assertThat(
            "Can't execute Runnable",
            RunnableOf(
                FuncOf { input ->
                    done.set(true)
                    true
                },
                true
            ),
            MatcherOf<Runnable>(FuncOf { input -> input.run(); done.get() })
        )
    }
}
