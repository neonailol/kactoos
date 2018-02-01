
package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedBiFunc].
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 304398f9a9733c9f3d032acc882e22cb6019db4a $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedBiFuncTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedBiFunc<Any, Any, Any>(
                { fst, scd -> throw IOException("intended") }
        ).apply(1, 2)
    }

    @Test
    fun testUncheckedBiFunc() {
        MatcherAssert.assertThat(
                UncheckedBiFunc<Any, Any, Boolean>(
                        { fst, scd -> true }
                ).apply(1, 2),
                Matchers.equalTo(true)
        )
    }

    @Test(expected = IllegalStateException::class)
    fun runtimeExceptionGoesOut() {
        UncheckedBiFunc<Any, Any, Any>(
                { fst, scd -> throw IllegalStateException("intended to fail") }
        ).apply(1, 2)
    }
}
