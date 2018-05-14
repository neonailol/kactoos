package nnl.rocks.kactoos.io

import java.io.OutputStream

/**
 * Stream that copies output to output.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.16
 */
class TeeOutputStream(
    private val target: OutputStream,
    private val copy: OutputStream
) : OutputStream() {

    override fun write(data: Int) {
        try {
            this.target.write(data)
        } finally {
            this.copy.write(data)
        }
    }

    override fun write(buf: ByteArray) {
        try {
            this.target.write(buf)
        } finally {
            this.copy.write(buf)
        }
    }

    override fun write(
        buf: ByteArray,
        off: Int,
        len: Int
    ) {
        try {
            this.target.write(buf, off, len)
        } finally {
            this.copy.write(buf, off, len)
        }
    }

    override fun flush() {
        try {
            this.target.flush()
        } finally {
            this.copy.flush()
        }
    }

    override fun close() {
        try {
            this.target.close()
        } finally {
            this.copy.close()
        }
    }
}
