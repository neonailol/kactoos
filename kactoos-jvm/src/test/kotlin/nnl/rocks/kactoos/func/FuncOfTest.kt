package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Scalar
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [FuncOf].
 *
 *
 *
 * @since 0.20
 *
 */
class FuncOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsProcIntoFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            FuncOf(
                ProcOf(FuncOf<String, Unit> { input -> done.set(true) }),
                true
            ).apply("hello world"),
            Matchers.equalTo(done.get())
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsProcWithNoResultIntoFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            FuncOf<String, Scalar<Boolean>>(ProcOf({ done.set(true) })).apply("hello you"),
            Matchers.nullValue()
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsRunnableIntoFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            FuncOf<String, Boolean> { done.set(true); true }.apply("hello, world"),
            Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsValueIntoFunc() {
        MatcherAssert.assertThat(
            FuncOf<String, Boolean>(
                true
            ).apply("hello, dude!"),
            Matchers.equalTo(true)
        )
    }
}
