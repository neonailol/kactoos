package nnl.rocks.kactoos.func

import org.junit.Test
import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedProc].
 *
 *
 *
 * @since 0.2
 *
 */
class UncheckedProcTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedProc(ProcOf(FuncOf<Any, Any> { throw IOException("intended") })).exec(1)
    }

    @Test(expected = IllegalStateException::class)
    fun runtimeExceptionGoesOut() {
        UncheckedProc(ProcOf(FuncOf<Any, Any> { throw IllegalStateException("intended to fail") })).exec(1)
    }
}
