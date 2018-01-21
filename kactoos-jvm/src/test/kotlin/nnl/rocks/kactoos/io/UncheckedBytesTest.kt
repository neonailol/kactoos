package nnl.rocks.kactoos.io

import org.junit.Test
import java.io.IOException

/**
 * Test case for [UncheckedBytes].
 *
 * @since 0.3
 */
class UncheckedBytesTest {

    @Test(expected = RuntimeException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedBytes(BytesOf { throw IOException("intended") }).asBytes()
    }
}
