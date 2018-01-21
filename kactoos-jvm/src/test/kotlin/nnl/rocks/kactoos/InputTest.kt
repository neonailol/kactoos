package nnl.rocks.kactoos

import nnl.rocks.kactoos.io.DeadInput
import nnl.rocks.kactoos.io.InputOf
import org.junit.Test
import java.io.IOException

/**
 * Test case for [Input].
 * @since 0.10
 */
class InputTest {

    @Test
    @Throws(IOException::class)
    fun failForNullStream() {
        InputOf { dummy() }.stream()
    }

    @Test
    @Throws(IOException::class)
    fun okForNoNullInput() {
        InputOf(DeadInput()).stream()
    }
}
