package nnl.rocks.kactoos.scalar

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [IoCheckedScalar].
 *
 *
 *
 * @since 0.4
 *
 */
class IoCheckedScalarTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedScalar(
                ScalarOf<Any> { throw exception }
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
        IoCheckedScalar(
            ScalarOf<Any> { throw Exception("intended to fail") }
        ).value()
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedScalar(
            ScalarOf<Any> { throw IllegalStateException("intended to fail here") }
        ).value()
    }
}
