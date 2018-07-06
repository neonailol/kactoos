package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.KText
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.iterator.Mapped
import java.io.IOException

/**
 * Decodes origin [Text] using the hexadecimal encoding scheme.
 *
 * @since 0.4
 */
class HexBytes(
    private val origin: KText
) : Bytes {

    constructor(text: Text) : this({ text.asString() })

    override fun asBytes(): ByteArray {
        val hex = origin()
        if (hex.length and 1 == 1) {
            throw IOException("Length of hexadecimal text is odd")
        }
        val iterator = Mapped(
            { c: Char ->
                val result: Int = Character.digit(c, 16)
                if (result == - 1) {
                    throw IOException("Unexpected character: '$c'")
                }
                result
            },
            hex.iterator()
        )
        val result = ByteArray(hex.length / 2)
        var index = 0
        while (index < hex.length) {
            val most = iterator.next()
            val less = iterator.next()
            result[index ushr 1] = ((most shl 4) + less).toByte()
            index += 2
        }
        return result
    }
}
