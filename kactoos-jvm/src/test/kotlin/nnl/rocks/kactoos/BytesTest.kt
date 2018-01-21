package nnl.rocks.kactoos

import nnl.rocks.kactoos.io.BytesOf
import org.junit.Test
import java.io.IOException

/**
 * Test case for [Bytes].
 * @since 0.11
 */
class BytesTest {

    @Test
    @Throws(IOException::class)
    fun okForNoNulls() {
        BytesOf { ByteArray(1) }.asBytes()
    }
}
