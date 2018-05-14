package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input

import java.io.IOException
import java.io.InputStream
import java.util.logging.Logger

/**
 * Logged input.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin Data input
 * @param source The name of source data
 * @param logger Message logger
 * @since 0.3
 */
class LoggingInput constructor(
    private val origin: Input,
    private val source: String,
    private val logger: Logger = Logger.getLogger(source)
) : Input {

    @Throws(IOException::class)
    override fun stream(): InputStream {
        return LoggingInputStream(
            this.origin.stream(),
            this.source,
            this.logger
        )
    }
}
