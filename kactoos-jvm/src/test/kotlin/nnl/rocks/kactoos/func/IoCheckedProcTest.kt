package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Proc
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [IoCheckedProc].
 *
 *
 *
 * @since 0.4
 *
 */
class IoCheckedProcTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedProc(
                ProcOf(FuncOf { i: Int -> throw exception }) as Proc<Int>
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
        IoCheckedProc(ProcOf(FuncOf<Int, Int> { throw Exception("intended to fail") })).exec(1)
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedProc(ProcOf(FuncOf<Any, Any> { throw IllegalStateException("intended to fail here") })).exec(1)
    }
}
