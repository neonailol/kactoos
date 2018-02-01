
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [SubText].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 055c746b4e4c6d9cdc057dd61dfdd4f828ad4eec $
 * @since 0.11
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SubTextTest {

    @Test
    fun cutTextWithStartAndEnd() {
        MatcherAssert.assertThat(
                "Can't cut a text with start and end",
                // @checkstyle MagicNumber (1 line)
                SubText("hello world", 2, 50),
                TextHasString("llo world")
        )
    }

    @Test
    fun cutTextWithStart() {
        MatcherAssert.assertThat(
                "Can't cut a text with start",
                SubText("cut here", 2),
                TextHasString("t here")
        )
    }
}
