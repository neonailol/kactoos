package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedBiFunc].
 *
 *
 * @since 0.13
 *
 */
class UncheckedBiFuncTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedBiFunc<Any, Any, Any>(BiFuncOf { fst, scd -> throw IOException("intended") }).apply(1, 2)
    }

    @Test
    fun testUncheckedBiFunc() {
        MatcherAssert.assertThat(
            UncheckedBiFunc<Any, Any, Boolean>(BiFuncOf { fst, scd -> true }).apply(1, 2),
            Matchers.equalTo(true)
        )
    }

    @Test(expected = IllegalStateException::class)
    fun runtimeExceptionGoesOut() {
        UncheckedBiFunc<Any, Any, Any>(BiFuncOf { fst, scd -> throw IllegalStateException("intended to fail") }).apply(1, 2)
    }
}
