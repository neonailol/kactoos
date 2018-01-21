package nnl.rocks.kactoos.scalar

import org.junit.Test
import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedScalar].
 *
 *
 *
 * @since 0.3
 *
 */
class UncheckedScalarTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedScalar(
            ScalarOf<Any> { throw IOException("intended") }
        ).value()
    }
}
