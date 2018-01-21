package nnl.rocks.kactoos

/**
 * Bytes.
 *
 * @since 0.2
 */
actual interface Bytes {

    /**
     * Convert it to the byte array.
     * @return The byte array
     * @since 0.2
     */
    actual fun asBytes(): ByteArray
}
