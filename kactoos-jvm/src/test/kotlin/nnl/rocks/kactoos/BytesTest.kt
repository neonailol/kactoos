
package nnl.rocks.kactoos

import nnl.rocks.kactoos.io.BytesOf
import org.junit.Test

import java.io.IOException

/**
 * Test case for [Bytes.NoNulls].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 40aad580cc1fe8a44ba50110788f66198b486d20 $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class BytesTest {

    @Test
    @Throws(IOException::class)
    fun okForNoNulls() {
        BytesOf { ByteArray(1) }.asBytes()
    }
}
