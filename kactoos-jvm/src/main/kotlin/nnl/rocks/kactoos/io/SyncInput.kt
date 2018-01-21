package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input

import java.io.IOException
import java.io.InputStream

/**
 * Thread-safe [Input].
 *
 * There is no thread-safety guarantee.
 *
 * @since 0.18
 */
class SyncInput(
    private val origin: Input,
    private val lock: Any
) : Input {

    constructor(origin: Input) : this(origin, origin)

    @Throws(IOException::class)
    override fun stream(): InputStream {
        synchronized(this.lock) {
            return this.origin.stream()
        }
    }
}
