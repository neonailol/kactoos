package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.io.BytesOf
import nnl.rocks.kactoos.text.HexOf
import nnl.rocks.kactoos.text.TextOf
import java.io.IOException
import kotlin.test.Test
import kotlin.test.assertEquals

class HexBytesTest {

    @Test
    fun emptyText() {
        assertEquals(
            HexBytes(TextOf("")).asBytes(),
            byteArrayOf(),
            "Can't represent an empty hexadecimal text"
        )
    }

    @Test
    fun validHex() {
        val bytes = ByteArray(256).apply {
            forEachIndexed { index: Int, _: Byte ->
                this[index] = (index + Byte.MIN_VALUE).toByte()
            }
        }
        assertEquals(
            HexBytes(HexOf(BytesOf(*bytes))).asBytes(),
            bytes,
            "Can't convert hexadecimal text to bytes"
        )
    }

    @Test(expectedExceptions = [IOException::class])
    fun invalidLength() {
        HexBytes(TextOf("ABF")).asBytes()
    }

    @Test(expectedExceptions = [IOException::class])
    fun invalidHexValue() {
        HexBytes(TextOf("ABG!")).asBytes()
    }
}
