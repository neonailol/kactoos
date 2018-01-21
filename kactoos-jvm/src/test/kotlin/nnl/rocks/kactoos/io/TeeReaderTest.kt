package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.InputHasContent
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.IOException

/**
 * Test case for [TeeReader].
 *
 *
 *
 * @since 0.13
 *
 */
class TeeReaderTest {

    @Test
    @Throws(IOException::class)
    fun testTeeReader() {
        val baos = ByteArrayOutputStream()
        val content = "Hello, товарищ!"
        val reader = TeeReader(
            ReaderOf(content),
            WriterTo(baos)
        )
        var done = 0
        while (done >= 0) {
            done = reader.read()
        }
        reader.close()
        MatcherAssert.assertThat(
            "Can't read content",
            InputOf(ReaderOf(baos.toByteArray())),
            InputHasContent(content)
        )
    }
}
