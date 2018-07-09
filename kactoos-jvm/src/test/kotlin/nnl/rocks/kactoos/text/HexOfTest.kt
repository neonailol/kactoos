package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class HexOfTest {

    @Test
    fun emptyBytes() {
        AssertTextsEquals(
            TrimmedText { "" },
            HexOf { byteArrayOf() },
            "Can't represent empty string as hex string"
        )
    }

    @Test
    fun bytes() {
        AssertTextsEquals(
            TrimmedText { "010203" },
            HexOf { byteArrayOf(1, 2, 3) },
            "Can't represent byte array as hex string"
        )
    }
}
