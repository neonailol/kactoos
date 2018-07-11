package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class ReversedTextTest {

    @Test
    fun reversesString() {
        AssertTextsEquals(
            ReversedText { "123" },
            TextOf { "321" },
            "Can't reverse string"
        )
    }

    @Test
    fun reversesText() {
        AssertTextsEquals(
            ReversedText(TextOf { "123" }),
            TextOf { "321" },
            "Can't reverse string"
        )
    }
}
