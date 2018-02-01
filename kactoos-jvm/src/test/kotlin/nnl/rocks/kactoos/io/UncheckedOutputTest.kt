
package nnl.rocks.kactoos.io

import org.junit.Test

import java.io.IOException

/**
 * Test case for [UncheckedOutput].
 *
 * @author Alexey Semenyuk (semenyukalexey88@gmail.com)
 * @version $Id: 51441c1fb0a239d1d0cf66c30a42f9c0cc1e516d $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedOutputTest {

    @Test(expected = RuntimeException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedOutput(
                { throw IOException("intended") }
        ).stream()
    }
}
