package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import java.io.IOException
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException

/**
 * Digest Envelope.
 *
 * There is no thread-safety guarantee.
 *
 * @param source The input
 * @param size Buffer size
 * @param algorithm The algorithm
 * @since 0.3
 */
abstract class DigestEnvelope(
    private val source: Input,
    private val size: Int,
    private val algorithm: String
) : Bytes {

    /**
     * @param input The input
     * @param algrthm The algorithm
     */
    constructor(
        input: Input,
        algrthm: String
    ) : this(input, 16 shl 10, algrthm)

    override fun asBytes(): ByteArray {
        try {
            val msg = MessageDigest.getInstance(this.algorithm)
            this.source.stream().use { stream ->
                val buf = ByteArray(this.size)
                while (true) {
                    val len = stream.read(buf)
                    if (len < 0) {
                        break
                    }
                    msg.update(buf, 0, len)
                }
                return msg.digest()
            }
        } catch (ex: NoSuchAlgorithmException) {
            throw IOException(ex)
        }
    }
}
