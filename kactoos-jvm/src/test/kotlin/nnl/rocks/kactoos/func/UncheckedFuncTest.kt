
package nnl.rocks.kactoos.func

import nnl.rocks.kactoos.Func
import org.junit.Test

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedFunc].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: d1376c6a2b081318268c8e006c058a19b307c539 $
 * @since 0.2
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedFuncTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedFunc(
                { i -> throw IOException("intended") } as Func<Int, String>
        ).apply(1)
    }

    @Test(expected = IllegalStateException::class)
    fun runtimeExceptionGoesOut() {
        UncheckedFunc<Any, Any>(
                { i -> throw IllegalStateException("intended to fail") }
        ).apply(1)
    }
}
