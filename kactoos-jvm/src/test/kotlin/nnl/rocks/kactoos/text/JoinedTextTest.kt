package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException

/**
 * Test case for [JoinedText].
 *
 *
 * @since 0.9
 *
 */
class JoinedTextTest {

    @Test
    @Throws(IOException::class)
    fun joinsStrings() {
        MatcherAssert.assertThat(
            "Can't join strings",
            JoinedText(" ", "hello", "world"),
            TextHasString("hello world")
        )
    }

    @Test
    @Throws(IOException::class)
    fun joinsTexts() {
        MatcherAssert.assertThat(
            "Can't join texts",
            JoinedText(
                TextOf(" "),
                TextOf("foo"),
                TextOf("bar")
            ),
            TextHasString("foo bar")
        )
    }
}
