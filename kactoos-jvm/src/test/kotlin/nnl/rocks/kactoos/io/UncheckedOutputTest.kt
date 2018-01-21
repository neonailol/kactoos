package nnl.rocks.kactoos.io

import org.junit.Test
import java.io.IOException

/**
 * Test case for [UncheckedOutput].
 *
 *
 *
 * @since 0.11
 *
 */
class UncheckedOutputTest {

    @Test(expected = IOException::class)
    fun rethrowsCheckedToUncheckedException() {
        OutputTo { throw IOException("intended") }.stream()
    }
}
