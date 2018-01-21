package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [IoCheckedFunc].
 *
 *
 *
 * @since 0.4
 *
 */
class IoCheckedFuncTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedFunc(
                FuncOf { i: Int -> throw exception }
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
        IoCheckedFunc<Any, Any>(FuncOf { i -> throw Exception("intended to fail") }).apply(1)
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedFunc<Any, Any>(FuncOf { i -> throw IllegalStateException("intended to fail here") }).apply(1)
    }
}
