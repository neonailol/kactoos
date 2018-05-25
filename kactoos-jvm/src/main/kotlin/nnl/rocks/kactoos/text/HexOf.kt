package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Text

/**
 * Hexadecimal representation of Bytes.
 *
 * There is no thread-safety guarantee.
 *
 * @param bytes The bytes
 * @since 0.5
 */
class HexOf(private val bytes: Bytes) : Text {

    override fun asString(): String {
        val bts = bytes.asBytes()
        val hex = CharArray(bts.size * 2)
        var chr = - 1
        for (idx in bts.indices) {
            val value = 0xff and bts[idx].toInt()
            hex[++ chr] = HEX_CHARS[value ushr 4]
            hex[++ chr] = HEX_CHARS[value and 0x0f]
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
