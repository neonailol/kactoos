package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Output

import java.io.IOException
import java.io.OutputStream
import java.util.logging.Logger

/**
 * Logged output.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin Data output
 * @param destination The name of destination data
 * @param logger Message logger
 * @since 0.3
 */
class LoggingOutput constructor(
    private val origin: Output,
    private val destination: String,
    private val logger: Logger = Logger.getLogger(destination)
) : Output {

    @Throws(IOException::class)
    override fun stream(): OutputStream {
        return LoggingOutputStream(
            this.origin.stream(),
            this.destination,
            this.logger
        )
    }
}
