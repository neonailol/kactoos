
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.iterable.LengthOf
import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [SplitText].
 * @author Alexey Semenyuk (semenyukalexey@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 83e96b4a413449a7036790d36ada630a0614dcde $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SplitTextTest {

    @Test
    @Throws(Exception::class)
    fun splitTextLength() {
        MatcherAssert.assertThat(
                "Can't split a text. Incorrect length",
                LengthOf(
                        SplitText("Hello world!", "\\s+")
                ).toInt(),
                Matchers.equalTo(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun splitTextItem() {
        MatcherAssert.assertThat<Text>(
                "Can't split a text. Incorrect item",
                SplitText("Hello world! [2]", "\\s+").iterator().next(),
                TextHasString("Hello")
        )
    }

    @Test
    @Throws(Exception::class)
    fun splitStringWithTextRegex() {
        MatcherAssert.assertThat<Text>(
                "Can't split an string with text regex",
                SplitText(
                        "Cactoos OOP!",
                        TextOf("\\s")
                ).iterator().next(),
                TextHasString("Cactoos")
        )
    }

    @Test
    @Throws(Exception::class)
    fun splitTextWithStringRegex() {
        MatcherAssert.assertThat<Text>(
                "Can't split an text with string regex",
                SplitText(
                        TextOf("Cact4Primitives!"),
                        "\\d+"
                ).iterator().next(),
                TextHasString("Cact")
        )
    }

    @Test
    @Throws(Exception::class)
    fun splitTextWithTextRegex() {
        MatcherAssert.assertThat<Text>(
                "Can't split an text with text regex",
                SplitText(
                        TextOf("Split#OOP!"),
                        "\\W+"
                ).iterator().next(),
                TextHasString("Split")
        )
    }
}
