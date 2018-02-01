
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException
import java.io.StringReader

/**
 * Test case for [ReaderAsBytes].
 *
 * @author Kirill (g4s8.public@gmail.com)
 * @version $Id: 779161b2c8c3e4979cd36ff54892439f498b690a $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class ReaderAsBytesTest {

    @Test
    @Throws(IOException::class)
    fun readsString() {
        val source = "hello, друг!"
        MatcherAssert.assertThat(
                "Can't read string through a reader",
                TextOf(
                        ReaderAsBytes(
                                StringReader(source)
                        )
                ).asString(),
                Matchers.equalTo(source)
        )
    }
}
