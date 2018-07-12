package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class HexOfTest {

    @Test
    fun emptyBytes() {
        AssertTextsEquals(
            HexOf { byteArrayOf() },
            TextOf { "" },
            "Can't represent empty string as hex string"
        )
    }

    @Test
    fun bytes() {
        AssertTextsEquals(
            HexOf { byteArrayOf(1, 2, 3) },
            TextOf { "010203" },
            "Can't represent byte array as hex string"
        )
    }
}
