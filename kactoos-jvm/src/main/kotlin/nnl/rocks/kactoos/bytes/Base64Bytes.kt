package nnl.rocks.kactoos.bytes

import nnl.rocks.kactoos.Bytes
import java.util.Base64

/**
 * Decodes all origin bytes using the Base64 encoding scheme.
 *
 * @param origin Origin bytes.
 * @param decoder Which [Base64.Decoder] to use.
 * @since 0.3
 */
class Base64Bytes(
    private val origin: Bytes,
    private val decoder: Base64.Decoder
) : Bytes {

    /**
     * Uses [Base64.getDecoder] as [decoder]
     * @param origin Origin bytes.
     */
    constructor(origin: Bytes) : this(origin, Base64.getDecoder())

    override fun asBytes(): ByteArray = decoder.decode(this.origin.asBytes())
}
