package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class PaddedEndTextTest {

    @Test
    fun noPaddingIfOrigTextIsAsLongAsRequestedLength() {
        AssertTextsEquals(
            PaddedEndText(TextOf { "x" }, 1, '-'),
            TextOf { "x" },
            "Shouldn't pad the text"
        )
    }

    @Test
    fun somePaddingIfOrigTextIsShorterThanRequestedLength() {
        AssertTextsEquals(
            PaddedEndText(TextOf { "x" }, 2, '-'),
            TextOf { "x-" },
            "Should pad chars at end"
        )
    }

    @Test
    fun noPaddingIfRequestedLengthIsNegative() {
        AssertTextsEquals(
            PaddedEndText(TextOf { "x" }, - 1, '-'),
            TextOf { "x" },
            "Shouldn't consider negative min length"
        )
    }
}
