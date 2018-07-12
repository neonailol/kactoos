package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class SubTextTest {

    @Test
    fun cutsStringWithStartAndEnd() {
        AssertTextsEquals(
            SubText("Hello, World!", 7, 50),
            TextOf { "World!" },
            "Can't cut a text with start and end"
        )
    }

    @Test
    fun cutsStringWithStart() {
        AssertTextsEquals(
            SubText("Hello, World!", 7),
            TextOf { "World!" },
            "Can't cut a text with start"
        )
    }

    @Test
    fun cutsTextWithStartAndEnd() {
        AssertTextsEquals(
            SubText(TextOf { "Hello, World!" }, 0, 5),
            TextOf { "Hello" },
            "Can't cut a text with start and end"
        )
    }
}
