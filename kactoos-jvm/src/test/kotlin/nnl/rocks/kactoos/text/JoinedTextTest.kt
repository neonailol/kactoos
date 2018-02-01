
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException

/**
 * Test case for [JoinedText].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 5ccae04be02001b29e39df5f9510751ddf79d87d $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
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
