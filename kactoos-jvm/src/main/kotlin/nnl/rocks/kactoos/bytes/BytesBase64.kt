package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.Bytes
import java.util.Base64

/**
 * Encodes all origin bytes using the Base64 encoding scheme.
 *
 * @param origin Origin bytes.
 * @param encoder Which [Base64.Encoder] to use
 * @since 0.3
 */
class BytesBase64(
    private val origin: Bytes,
    private val encoder: Base64.Encoder
) : Bytes {

    /**
     * Uses [Base64.getEncoder] as [encoder]
     * @param origin Origin bytes.
     */
    constructor(origin: Bytes) : this(origin, Base64.getEncoder())

    override fun asBytes(): ByteArray = encoder.encode(this.origin.asBytes())
}
