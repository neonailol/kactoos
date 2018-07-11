package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class TrimmedLeftTextTest {

    @Test
    fun convertsText() {
        AssertTextsEquals(
            TrimmedLeftText(TextOf { "  Hello!   \t " }),
            TextOf { "Hello!   \t " },
            "Can't left trim a text"
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        AssertTextsEquals(
            TrimmedLeftText(TextOf { "  \t " }),
            TextOf { "" },
            "Can't trim a blank text"
        )
    }
}
