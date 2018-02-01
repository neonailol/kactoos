package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [BiFuncOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 7bc25f3e622718c4adae2e036643f66baf9a849f $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class BiFuncOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsFuncIntoBiFunc() {
        MatcherAssert.assertThat(
            BiFuncOf { any: Any, any1: Any -> 1 }.apply(1, 2),
            Matchers.equalTo(1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsProcIntoBiFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            BiFuncOf(
                BiProcOf { s: String, i: Int -> done.set(true) },
                true
            ).apply("hello world", 1),
            Matchers.equalTo(done.get())
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsProcWithNoResultIntoBiFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat<Boolean>(
            BiFuncOf { s: String, i: Int -> done.set(true); true }.apply("hello you", 1),
            Matchers.nullValue()
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsRunnableIntoBiFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
            BiFuncOf { s: String, i: Int -> done.set(true); true }.apply("hello, world", 1),
            Matchers.nullValue()
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
