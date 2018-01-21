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
 *
 *
 * @since 0.12
 *
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
