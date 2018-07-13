package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class LowerTextTest {

    @Test
    fun lowersString() {
        AssertTextsEquals(
            LowerText { "HeLLo!" },
            TextOf { "hello!" },
            "Can't lower case a string"
        )
    }

    @Test
    fun lowersText() {
        AssertTextsEquals(
            LowerText(TextOf { "HeLLo!" }),
            TextOf { "hello!" },
            "Can't lower case a text"
        )
    }
}
