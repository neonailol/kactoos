
package nnl.rocks.kactoos.func

import org.junit.Test

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedProc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 11481872b47c22d511ecf34f183561770166ebf5 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedProcTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedProc<Any>(
                { input -> throw IOException("intended") }
        ).exec(1)
    }

    @Test(expected = IllegalStateException::class)
    fun runtimeExceptionGoesOut() {
        UncheckedProc<Any>(
                { i -> throw IllegalStateException("intended to fail") }
        ).exec(1)
    }
}
