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
 * Test case for [TeeInputStream].
 *
 *
 * @since 0.1
 *
 *
 */
class TeeInputStreamTest {

    @Test
    @Throws(IOException::class)
    fun copiesContentByteByByte() {
        val baos = ByteArrayOutputStream()
        val content = "Hello, товарищ!"
        MatcherAssert.assertThat(
            "Can't copy InputStream to OutputStream byte by byte",
            asString(
                TeeInputStream(
                    ByteArrayInputStream(
                        content.toByteArray(StandardCharsets.UTF_8)
                    ),
                    baos
                )
            ),
            Matchers.allOf(
                Matchers.equalTo(content),
                Matchers.equalTo(
                    String(baos.toByteArray(), StandardCharsets.UTF_8)
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
