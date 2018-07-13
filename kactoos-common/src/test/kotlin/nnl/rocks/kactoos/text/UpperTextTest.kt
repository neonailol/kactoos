package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class UpperTextTest {

    @Test
    fun uppersString() {
        AssertTextsEquals(
            UpperText { "HeLLo!" },
            TextOf { "HELLO!" },
            "Can't upper case a string"
        )
    }

    @Test
    fun uppersText() {
        AssertTextsEquals(
            UpperText(TextOf { "HeLLo!" }),
            TextOf { "HELLO!" },
            "Can't upper case a text"
        )
    }
}
