
package nnl.rocks.kactoos.text

import org.junit.Test

import java.io.IOException

/**
 * Test case for [UncheckedText].
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: b1df523d06db537d77c64f8ad5b82f82fd1a2400 $
 * @since 0.3
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class UncheckedTextTest {

    @Test(expected = RuntimeException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedText(
                { throw IOException("intended") }
        ).asString()
    }
}
