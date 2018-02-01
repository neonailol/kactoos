
package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.concurrent.atomic.AtomicBoolean

/**
 * Test case for [FuncOf].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 2f95852a9f8364fcebde018f88171b0a06003fdd $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class FuncOfTest {

    @Test
    @Throws(Exception::class)
    fun convertsProcIntoFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
                FuncOf<String, Boolean>(
                        { input -> done.set(true) },
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
                FuncOf<String, Boolean> { input -> done.set(true) }.apply("hello you"),
                Matchers.nullValue()
        )
    }

    @Test
    @Throws(Exception::class)
    fun convertsRunnableIntoFunc() {
        val done = AtomicBoolean(false)
        MatcherAssert.assertThat(
                FuncOf<String, Boolean> { done.set(true) }.apply("hello, world"),
                Matchers.nullValue()
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
