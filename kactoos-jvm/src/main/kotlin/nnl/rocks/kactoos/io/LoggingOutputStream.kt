package nnl.rocks.kactoos.io

import java.io.OutputStream
import java.time.Duration
import java.time.Instant
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Level
import java.util.logging.Logger

/**
 * Logged output stream.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin Destination of data
 * @param destination The name of source data
 * @param logger Message logger
 * @since 0.3
 */
class LoggingOutputStream constructor(
    private val origin: OutputStream,
    private val destination: String,
    private val logger: Logger = Logger.getLogger(destination)
) : OutputStream() {

    private val bytes: AtomicLong = AtomicLong()
    private val time: AtomicLong = AtomicLong()

    override fun write(data: Int) {
        val buf = byteArrayOf(data.toByte())
        this.write(buf, 0, 1)
    }

    override fun write(buf: ByteArray) {
        this.write(buf, 0, buf.size)
    }

    override fun write(
        buf: ByteArray,
        offset: Int,
        len: Int
    ) {
        val start = Instant.now()
        this.origin.write(buf, offset, len)
        val end = Instant.now()
        val millis = Duration.between(start, end).toMillis()
        this.bytes.getAndAdd(len.toLong())
        this.time.getAndAdd(millis)
        val level = this.logger.level
        if (level != Level.INFO) {
            this.logger.log(
                level,
                String.format(
                    "Written %d byte(s) to %s in %dms.",
                    this.bytes.get(),
                    this.destination,
                    this.time.get()
                )
            )
        }
    }

    override fun close() {
        this.origin.close()
        val level = this.logger.level
        if (level == Level.INFO) {
            this.logger.log(
                level,
                String.format(
                    "Written %d byte(s) to %s in %dms.",
                    this.bytes.get(),
                    this.destination,
                    this.time.get()
                )
            )
        }
        this.logger.log(
            level,
            String.format(
                "Closed output stream from %s.",
                this.destination
            )
        )
    }

    override fun flush() {
        this.origin.flush()
        val level = this.logger.level
        if (level == Level.INFO) {
            this.logger.log(
                level,
                String.format(
                    "Written %d byte(s) to %s in %dms.",
                    this.bytes.get(),
                    this.destination,
                    this.time.get()
                )
            )
        }
        this.logger.log(
            level,
            String.format(
                "Flushed output stream from %s.",
                this.destination
            )
        )
    }
}
