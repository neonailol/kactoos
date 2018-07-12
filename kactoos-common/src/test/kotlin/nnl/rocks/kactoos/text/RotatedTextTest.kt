package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class RotatedTextTest {

    @Test
    fun rotateRightText() {
        AssertTextsEquals(
            RotatedText(TextOf { "Hello!" }, 2),
            TextOf { "o!Hell" },
            "Can't rotate text to right"
        )
    }

    @Test
    fun rotateLeftText() {
        AssertTextsEquals(
            RotatedText(TextOf { "Hi!" }, - 1),
            TextOf { "i!H" },
            "Can't rotate text to left"
        )
    }

    @Test
    fun noRotateWhenShiftZero() {
        AssertTextsEquals(
            RotatedText(TextOf { "Cactoos!" }, 0),
            TextOf { "Cactoos!" },
            "Rotate text shift zero"
        )
    }

    @Test
    fun noRotateWhenShiftModZero() {
        AssertTextsEquals(
            RotatedText(TextOf { "Cactoos!" }, "Cactoos!".length),
            TextOf { "Cactoos!" },
            "Rotate text shift mod zero"
        )
    }

    @Test
    fun noRotateWhenEmpty() {
        AssertTextsEquals(
            RotatedText(TextOf { "" }, 2),
            TextOf { "" },
            "Rotate text when empty"
        )
    }
}
