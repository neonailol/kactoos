package nnl.rocks.kactoos.func

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [IoCheckedBiFunc].
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 0710f67c4303cfc8bdaf68c5c0a18d4c7ea94352 $
 * @since 0.13
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class IoCheckedBiFuncTest {

    @Test
    fun rethrowsIoException() {
        val exception = IOException("intended")
        try {
            IoCheckedBiFunc<Any, Any, Any>(
                BiFuncOf { fst, scd -> throw exception }
            ).apply(1, 2)
        } catch (ex: IOException) {
            MatcherAssert.assertThat(
                ex, Matchers.`is`(exception)
            )
        }
    }

    @Test(expected = IOException::class)
    @Throws(Exception::class)
    fun rethrowsCheckedToIoException() {
        IoCheckedBiFunc<Any, Any, Any>(
            BiFuncOf { fst, scd -> throw Exception("intended to fail") }
        ).apply(1, 2)
    }

    @Test(expected = IllegalStateException::class)
    @Throws(IOException::class)
    fun runtimeExceptionGoesOut() {
        IoCheckedBiFunc<Any, Any, Any>(
            BiFuncOf{ fst, scd -> throw IllegalStateException("intended to fail here") }
        ).apply(1, 2)
    }
}
