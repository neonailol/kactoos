package nnl.rocks.kactoos

import java.io.IOException

/**
 * Bytes.
 *
 * There is no thread-safety guarantee.
 *
 * @see nnl.rocks.kactoos.io.BytesOf
 * @since 0.2
 */
@FunctionalInterface
actual interface Bytes {

    /**
     * Convert it to the byte array.
     * @return The byte array
     * @throws IOException If fails
     * @since 0.2
     */
    @Throws(IOException::class)
    actual fun asBytes(): ByteArray

    class NoNulls(private val origin: Bytes) : Bytes {

        @Throws(IOException::class)
        override fun asBytes(): ByteArray = origin.asBytes()
    }
}
