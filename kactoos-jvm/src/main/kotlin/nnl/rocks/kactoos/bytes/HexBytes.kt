package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterator.Mapped
import nnl.rocks.kactoos.text.FormattedText
import java.io.IOException
import java.io.UncheckedIOException

/**
 * Decodes origin [Text] using the hexadecimal encoding scheme.
 *
 * @since 0.5
 */
class HexBytes(
    private val origin: Text
) : Bytes {

    override fun asBytes(): ByteArray {
        val hex = origin.asString()
        if (hex.length and 1 == 1) {
            throw IOException("Length of hexadecimal text is odd")
        }
        val iter = Mapped<Char, Int>(
            FuncOf { c ->
                val result = Character.digit(c, 16)
                if (result == - 1) {
                    throw IOException(
                        FormattedText(
                            "Unexpected character '%c'",
                            c
                        ).asString()
                    )
                }
                result
            },
            hex.chars().mapToObj { c -> c.toChar() }.iterator()
        )
        val result = ByteArray(hex.length / 2)
        var index = 0
        while (index < hex.length) {
            try {
                val most = iter.next()
                val less = iter.next()
                result[index.ushr(1)] = ((most shl 4) + less).toByte()
                index += 2
            } catch (ex: UncheckedIOException) {
                throw ex.cause !!
            }
        }
        return result
    }
}
