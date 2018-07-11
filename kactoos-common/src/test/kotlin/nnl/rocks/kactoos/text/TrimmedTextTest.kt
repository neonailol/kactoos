package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class TrimmedTextTest {

    @Test
    fun convertsText() {
        AssertTextsEquals(
            TrimmedText { "  Hello!   \t " },
            TextOf { "Hello!" },
            "Can't trim a text"
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        AssertTextsEquals(
            TrimmedText { "  \t " },
            TextOf { "" },
            "Can't trim a blank text"
        )
    }
}
