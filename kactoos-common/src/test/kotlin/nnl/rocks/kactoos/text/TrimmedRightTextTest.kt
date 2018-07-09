package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import nnl.rocks.kactoos.test.TextOf
import kotlin.test.Test

class TrimmedRightTextTest {

    @Test
    fun convertsText() {
        AssertTextsEquals(
            TrimmedRightText(TextOf("  Hello!   \t ")),
            TextOf("  Hello!"),
            "Can't right trim a text"
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        AssertTextsEquals(
            TrimmedRightText(TextOf("  \t ")),
            TextOf(""),
            "Can't trim a blank text"
        )
    }
}
