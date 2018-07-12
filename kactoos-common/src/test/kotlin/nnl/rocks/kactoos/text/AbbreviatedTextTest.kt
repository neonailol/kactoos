package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class AbbreviatedTextTest {

    @Test
    fun abbreviates() {
        AssertTextsEquals(
            AbbreviatedText("Hello, World!", 8),
            TextOf { "Hello..." },
            "Can't abbreviate string"
        )
    }
}
