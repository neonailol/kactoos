
package nnl.rocks.kactoos.io

import org.junit.Test

import java.io.IOException

/**
 * Test case for [UncheckedBytes].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: c56cc8e758b92ea80e26d493a85ddea9c998ec9f $
 * @since 0.3
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedBytesTest {

    @Test(expected = RuntimeException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedBytes(
                BytesOf{ throw IOException("intended") }
        ).asBytes()
    }
}
