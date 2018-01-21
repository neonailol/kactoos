package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes

/**
 * Bytes with no data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.2
 */
class EmptyBytes : Bytes {

    override fun asBytes(): ByteArray = EmptyBytes.EMPTY

    companion object {

        /**
         * Empty array of bytes.
         */
        private val EMPTY = byteArrayOf()
    }
}
