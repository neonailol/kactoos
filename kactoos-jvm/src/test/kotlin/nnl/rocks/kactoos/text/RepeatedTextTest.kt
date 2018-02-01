
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [RepeatedText].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: c7b15e8dab04567535661de8bc7620b2330cecd0 $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class RepeatedTextTest {

    @Test
    fun repeatsWordsText() {
        MatcherAssert.assertThat(
                "Can't repeats a text",
                // @checkstyle MagicNumber (1 line)
                RepeatedText("hello", 2),
                TextHasString("hellohello")
        )
    }

    @Test
    fun repeatsCharText() {
        MatcherAssert.assertThat(
                "Can't repeats a char",
                // @checkstyle MagicNumber (1 line)
                RepeatedText("A", 5),
                TextHasString("AAAAA")
        )
    }
}
