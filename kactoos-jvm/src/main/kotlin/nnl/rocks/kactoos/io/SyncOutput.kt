package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output
import java.io.OutputStream

/**
 * Thread-safe [Output].
 *
 *
 * There is no thread-safety guarantee.
 *
 *
 *
 * @since 0.18
 */
class SyncOutput(
    private val origin: Output,
    private val lock: Any
) : Output {

    constructor(origin: Output) : this(origin, origin)

    override fun stream(): OutputStream {
        synchronized(this.lock) {
            return this.origin.stream()
        }
    }
}
