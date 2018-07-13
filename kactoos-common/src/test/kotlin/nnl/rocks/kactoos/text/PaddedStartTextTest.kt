package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class PaddedStartTextTest {

    @Test
    fun noPaddingIfOrigTextIsAsLongAsRequestedLength() {
        AssertTextsEquals(
            PaddedStartText(TextOf { "x" }, 1, '-'),
            TextOf { "x" },
            "Shouldn't pad the text"
        )
    }

    @Test
    fun somePaddingIfOrigTextIsShorterThanRequestedLength() {
        AssertTextsEquals(
            PaddedStartText(TextOf { "x" }, 2, '-'),
            TextOf { "-x" },
            "Should pad chars at start"
        )
    }

    @Test
    fun noPaddingIfRequestedLengthIsNegative() {
        AssertTextsEquals(
            PaddedStartText(TextOf { "x" }, - 1, '-'),
            TextOf { "x" },
            "Shouldn't consider negative min length"
        )
    }
}
