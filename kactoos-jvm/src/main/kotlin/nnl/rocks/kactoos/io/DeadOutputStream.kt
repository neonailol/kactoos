package nnl.rocks.kactoos.io

import java.io.OutputStream

/**
 * OutputStream that accepts anything.
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.1
 */
class DeadOutputStream : OutputStream() {

    override fun write(data: Int) {
        // nothing to do here
    }
}
