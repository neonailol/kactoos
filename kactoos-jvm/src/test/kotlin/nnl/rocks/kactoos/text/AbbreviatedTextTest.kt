
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [AbbreviatedText].
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 1a82235067f534bb9f72c33f767615f0db72b26a $
 * @since 0.29
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class AbbreviatedTextTest {

    @Test
    fun abbreviatesAnEmptyText() {
        val msg = ""
        MatcherAssert.assertThat(
                "Can't abbreviate an msg text",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText(msg, 8),
                TextHasString(msg)
        )
    }

    @Test
    fun abbreviatesText() {
        MatcherAssert.assertThat(
                "Can't abbreviate a text",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText("hello world", 8),
                TextHasString("hello...")
        )
    }

    @Test
    fun abbreviatesTextOneCharSmaller() {
        MatcherAssert.assertThat(
                "Can't abbreviate a text one char smaller",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText("oo programming", 10),
                TextHasString("oo prog...")
        )
    }

    @Test
    fun abbreviatesTextWithSameLength() {
        val msg = "elegant objects"
        MatcherAssert.assertThat(
                "Can't abbreviate a text with same length",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText(msg, 15),
                TextHasString(msg)
        )
    }

    @Test
    fun abbreviatesTextOneCharBigger() {
        val msg = "the old mcdonald"
        MatcherAssert.assertThat(
                "Can't abbreviate a text one char bigger",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText(msg, 17),
                TextHasString(msg)
        )
    }

    @Test
    fun abbreviatesTextTwoCharsBigger() {
        val msg = "hi everybody!"
        MatcherAssert.assertThat(
                "Can't abbreviate a text two chars bigger",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText(msg, 15),
                TextHasString(msg)
        )
    }

    @Test
    fun abbreviatesTextWithWidthBiggerThanLength() {
        val msg = "cactoos framework"
        MatcherAssert.assertThat(
                "Can't abbreviate a text with width bigger than length",
                // @checkstyle MagicNumber (1 line)
                AbbreviatedText(msg, 50),
                TextHasString(msg)
        )
    }

    @Test
    fun abbreviatesTextBiggerThanDefaultMaxWidth() {
        // @checkstyle LineLengthCheck (10 line)
        MatcherAssert.assertThat(
                "Can't abbreviate a text bigger than default max width",
                AbbreviatedText(
                        "The quick brown fox jumps over the lazy black dog and after that returned to the cave"
                ),
                TextHasString(
                        "The quick brown fox jumps over the lazy black dog and after that returned to ..."
                )
        )
    }
}
