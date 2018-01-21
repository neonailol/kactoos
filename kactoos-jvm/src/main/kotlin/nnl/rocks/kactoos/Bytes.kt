package nnl.rocks.kactoos

import java.io.IOException

/**
 * Bytes.
 *
 * There is no thread-safety guarantee.
 *
 * @see nnl.rocks.kactoos.io.BytesOf
 * @since 0.1
 */
@FunctionalInterface
interface Bytes {

    /**
     * Convert it to the byte array.
     * @return The byte array
     * @throws IOException If fails
     */
    @Throws(IOException::class)
    fun asBytes(): ByteArray
}

internal typealias KBytes = () -> ByteArray
