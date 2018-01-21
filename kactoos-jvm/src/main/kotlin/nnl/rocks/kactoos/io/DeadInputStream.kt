package nnl.rocks.kactoos.io

import java.io.InputStream

/**
 * InputStream with no data.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.16
 */
class DeadInputStream : InputStream() {

    override fun read(): Int = - 1
}
