package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [BiFuncOf].
 *
 * @since 0.20
 */
class BiFuncOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsFuncIntoBiFunc() {
        MatcherAssert.assertThat(
            BiFuncOf<Any, Any, Int>(FuncOf { input -> 1 }).apply(1, 2),
            Matchers.equalTo(1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsProcIntoBiFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            BiFuncOf<String, Int, Boolean>(
                ProcOf(FuncOf { input: String -> done.set(true) }),
                true
            ).apply("hello world", 1),
            Matchers.equalTo(done.get())
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsProcWithNoResultIntoBiFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            BiFuncOf<String, Int, Boolean>(FuncOf { input -> done.set(true); true }).apply("hello you", 1),
            Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsRunnableIntoBiFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat<Boolean>(
            BiFuncOf<String, Int, Boolean>(FuncOf { done.set(true); true }).apply("hello, world", 1),
            Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsValueIntoBiFunc() {
        MatcherAssert.assertThat(
            BiFuncOf<String, Int, Boolean>(
                true
            ).apply("hello, dude!", 1),
            Matchers.equalTo(true)
        )
    }
}
