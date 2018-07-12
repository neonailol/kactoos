package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class RepeatedTextTest {

    @Test
    fun repeatsString() {
        AssertTextsEquals(
            RepeatedText("string", 2),
            TextOf { "stringstring" },
            "Can't repeat string"
        )
    }

    @Test
    fun repeatsText() {
        AssertTextsEquals(
            RepeatedText(TextOf { "hello" }, 2),
            TextOf { "hellohello" },
            "Can't repeat text"
        )
    }
}
