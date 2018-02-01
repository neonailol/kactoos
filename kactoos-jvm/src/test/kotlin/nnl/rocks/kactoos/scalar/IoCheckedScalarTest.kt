
package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [IoCheckedScalar].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 9d1f207b6eee8884dab20f774ededf87fc3c04c9 $
 * @since 0.4
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class IoCheckedScalarTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedScalar<Any>(
                    { throw exception }
            ).value()
        } catch (ex: IOException) {
            MatcherAssert.assertThat(
                    ex, Matchers.`is`(exception)
            )
        }
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun throwsException() {
        IoCheckedScalar<Any>(
                { throw Exception("intended to fail") }
        ).value()
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedScalar<Any>(
                { throw IllegalStateException("intended to fail here") }
        ).value()
    }
}
