package nnl.rocks.kactoos.scalar

import org.junit.Test

import java.io.IOException
import java.io.UncheckedIOException

/**
 * Test case for [UncheckedScalar].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: b9028b3f82bcbcd12dff2837bb468b594c04dfe7 $
 * @since 0.3
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedScalarTest {

    @Test(expected = UncheckedIOException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedScalar<Any>(
            { throw IOException("intended") }
        ).value()
    }
}
