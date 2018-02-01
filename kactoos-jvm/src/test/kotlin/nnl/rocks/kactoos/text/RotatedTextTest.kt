
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [RotatedText].
 *
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 87993b978cef9363f8138631dd61fdcfc27797f0 $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class RotatedTextTest {

    @Test
    fun rotateRightText() {
        MatcherAssert.assertThat(
                "Can't rotate text to right",
                RotatedText(
                        TextOf("Hello!"), 2
                ),
                TextHasString("o!Hell")
        )
    }

    @Test
    fun rotateLeftText() {
        MatcherAssert.assertThat(
                "Can't rotate text to left",
                RotatedText(
                        TextOf("Hi!"), - 1
                ),
                TextHasString("i!H")
        )
    }

    @Test
    fun noRotateWhenShiftZero() {
        val nonrotate = "Cactoos!"
        MatcherAssert.assertThat(
                "Rotate text shift zero",
                RotatedText(
                        TextOf(nonrotate), 0
                ),
                TextHasString(nonrotate)
        )
    }

    @Test
    fun noRotateWhenShiftModZero() {
        val nonrotate = "Rotate"
        MatcherAssert.assertThat(
                "Rotate text shift mod zero",
                RotatedText(
                        TextOf(nonrotate), nonrotate.length
                ),
                TextHasString(nonrotate)
        )
    }

    @Test
    fun noRotateWhenEmpty() {
        MatcherAssert.assertThat(
                "Rotate text when empty",
                RotatedText(
                        TextOf(""), 2
                ),
                TextHasString("")
        )
    }
}
