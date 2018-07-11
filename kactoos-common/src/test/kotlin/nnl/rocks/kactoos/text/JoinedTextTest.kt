package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class JoinedTextTest {

    @Test
    fun joinsStrings() {
        AssertTextsEquals(
            JoinedText(", ", "Hello", "World"),
            TextOf { "Hello, World" },
            "Can't join strings"
        )
    }

    @Test
    fun joinsTexts() {
        AssertTextsEquals(
            JoinedText(TextOf { ", " }, TextOf { "Hello" }, TextOf { "World" }),
            TextOf { "Hello, World" },
            "Can't join texts"
        )
    }
}
