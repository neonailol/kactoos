package nnl.rocks.kactoos

import nnl.rocks.kactoos.io.DeadOutput
import org.junit.Test
import java.io.IOException

/**
 * Test case for [Output].
 *
 *
 * @since 0.10
 *
 */
class OutputTest {

    @Test
    @Throws(IOException::class)
    fun okForNoNullOutput() {
        DeadOutput().stream()
    }
}
