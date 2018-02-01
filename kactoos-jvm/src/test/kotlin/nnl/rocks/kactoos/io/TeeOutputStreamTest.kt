
package nnl.rocks.kactoos.io

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.nio.charset.StandardCharsets

/**
 * Test case for [TeeOutputStream].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: a7e4c1ba2ae5398a452a447ccb195206ba19ef72 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class TeeOutputStreamTest {

    @Test
    @Throws(IOException::class)
    fun copiesContentByteByByte() {
        val baos = ByteArrayOutputStream()
        val copy = ByteArrayOutputStream()
        val content = "Hello, товарищ!"
        MatcherAssert.assertThat(
                "Can't copy OutputStream to OutputStream byte by byte",
                TeeOutputStreamTest.asString(
                        TeeInputStream(
                                ByteArrayInputStream(
                                        content.toByteArray(StandardCharsets.UTF_8)
                                ),
                                TeeOutputStream(baos, copy)
                        )
                ),
                Matchers.allOf(
                        Matchers.equalTo(content),
                        Matchers.equalTo(
                                String(baos.toByteArray(), StandardCharsets.UTF_8)
                        ),
                        Matchers.equalTo(
                                String(copy.toByteArray(), StandardCharsets.UTF_8)
                        )
                )
        )
    }

    @Throws(IOException::class)
    private fun asString(input: InputStream): String {
        val baos = ByteArrayOutputStream()
        while (true) {
            val data = input.read()
            if (data < 0) {
                break
            }
            baos.write(data)
        }
        input.close()
        return String(baos.toByteArray(), StandardCharsets.UTF_8)
    }
}
