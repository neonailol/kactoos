package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Text
import java.io.IOException

/**
 * Hexadecimal representation of Bytes.
 * @param bytes The bytes
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.28
 */
class HexOf(private val bytes: Bytes) : Text {

    @Throws(IOException::class)
    override fun asString(): String {
        val bts = this.bytes.asBytes()
        val hex = CharArray(bts.size * 2)
        var chr = - 1
        for (idx in bts.indices) {
            // @checkstyle MagicNumber (3 line)
            val value = 0xff and bts[idx].toInt()
            hex[++ chr] = HexOf.HEX_CHARS[value.ushr(4)]
            hex[++ chr] = HexOf.HEX_CHARS[value and 0x0f]
        }
        return String(hex)
    }

    companion object {

        /**
         * The hexadecimal chars.
         */
        private val HEX_CHARS = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')
    }
}
