package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [IoCheckedFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 2a08a5a6968b8464c77a50c5dc75f915f1d3c2be $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class IoCheckedFuncTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedFunc<Int, String>(
                { i -> throw exception }
            ).apply(1)
        } catch (ex: IOException) {
            MatcherAssert.assertThat(
                ex, Matchers.`is`(exception)
            )
        }
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun rethrowsCheckedToIoException() {
        IoCheckedFunc<Any, Any>(
            { i -> throw Exception("intended to fail") }
        ).apply(1)
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedFunc<Any, Any>(
            { i -> throw IllegalStateException("intended to fail here") }
        ).apply(1)
    }
}
