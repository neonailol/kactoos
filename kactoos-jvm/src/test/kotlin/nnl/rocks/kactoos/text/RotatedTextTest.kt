package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [RotatedText].
 *
 *
 *
 * @since 0.12
 *
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
        val nonrotate = "Kactoos!"
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
