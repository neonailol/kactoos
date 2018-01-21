package nnl.rocks.kactoos.func

import org.junit.Test
import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedFunc].
 *
 *
 *
 * @since 0.2
 *
 */
class UncheckedFuncTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedFunc(
            FuncOf { i: Int -> throw IOException("intended") }
        ).apply(1)
    }

    @Test(expected = IllegalStateException::class)
    fun runtimeExceptionGoesOut() {
        UncheckedFunc<Any, Any>(FuncOf { i -> throw IllegalStateException("intended to fail") }).apply(1)
    }
}
