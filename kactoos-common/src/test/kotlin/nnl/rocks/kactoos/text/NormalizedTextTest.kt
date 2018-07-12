package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class NormalizedTextTest {

    @Test
    fun normalizesString() {
        AssertTextsEquals(
            NormalizedText(" \t Hello,   \t\tWorld!   \t"),
            TextOf { "Hello, World!" },
            "Can't normalize string"
        )
    }
}
