
package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Proc
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [IoCheckedProc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: bc2f73be1d63f34c6c8e84b93eab74429334cf91 $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class IoCheckedProcTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedProc(
                    { i -> throw exception } as Proc<Int>
            ).exec(1)
        } catch (ex: IOException) {
            MatcherAssert.assertThat(
                    ex, Matchers.`is`(exception)
            )
        }
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun rethrowsCheckedToIoException() {
        IoCheckedProc<Any>(
                { i -> throw Exception("intended to fail") }
        ).exec(1)
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedProc<Any>(
                { i -> throw IllegalStateException("intended to fail here") }
        ).exec(1)
    }
}
