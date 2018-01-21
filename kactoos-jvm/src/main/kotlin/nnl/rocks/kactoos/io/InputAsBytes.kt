package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Bytes
import nnl.rocks.kactoos.Input
import java.io.ByteArrayOutputStream
import java.io.IOException

/**
 * Input as Byte Array.
 *
 * This class is for internal use only. Use [BytesOf] instead.
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.1
 */
internal class InputAsBytes(
    private val source: Input,
    private val size: Int = 16 shl 10
) : Bytes {

    @Throws(IOException::class)
    @Suppress("NestedBlockDepth")
    override fun asBytes(): ByteArray {
        ByteArrayOutputStream().use {
            TeeInput(
                this.source, OutputTo(it)
            ).stream().use { stream ->
                val buf = ByteArray(this.size)
                while (true) {
                    if (stream.read(buf) < 0) {
                        break
                    }
                }
                return it.toByteArray()
            }
        }
    }
}
