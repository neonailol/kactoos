package nnl.rocks.kactoos.io

import java.io.IOException
import java.io.InputStream
import java.time.Duration
import java.time.Instant
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Level
import java.util.logging.Logger

/**
 * Logged input stream.
 *
 * There is no thread-safety guarantee.
 *
 * @param origin Source of data
 * @param source The name of source data
 * @param logger The message logger
 * @since 0.3
 */
class LoggingInputStream constructor(
    private val origin: InputStream,
    private val source: String,
    private val logger: Logger = Logger.getLogger(source)
) : InputStream() {

    private val bytes: AtomicLong = AtomicLong()
    private val time: AtomicLong = AtomicLong()

    @Throws(IOException::class)
    override fun read(): Int {
        val buf = ByteArray(1)
        this.read(buf)
        return java.lang.Byte.toUnsignedInt(buf[0])
    }

    @Throws(IOException::class)
    override fun read(buf: ByteArray): Int = this.read(buf, 0, buf.size)

    @Throws(IOException::class)
    override fun read(
        buf: ByteArray,
        offset: Int,
        len: Int
    ): Int {
        val start = Instant.now()
        val byts = this.origin.read(buf, offset, len)
        val end = Instant.now()
        val millis = Duration.between(start, end).toMillis()
        val level = this.logger.level
        if (byts > 0) {
            this.bytes.getAndAdd(byts.toLong())
            this.time.getAndAdd(millis)
        }
        val msg = String.format(
            "Read %d byte(s) from %s in %dms.",
            this.bytes.get(),
            this.source,
            this.time.get()
        )
        if (byts > 0) {
            if (level != Level.INFO) {
                this.logger.log(level, msg)
            }
        } else {
            if (level == Level.INFO) {
                this.logger.info(msg)
            }
        }
        return byts
    }

    @Throws(IOException::class)
    override fun skip(num: Long): Long {
        val skipped = this.origin.skip(num)
        this.logger.log(
            this.logger.level,
            String.format(
                "Skipped %d byte(s) from %s.",
                skipped,
                this.source
            )
        )
        return skipped
    }

    @Throws(IOException::class)
    override fun available(): Int {
        val avail = this.origin.available()
        this.logger.log(
            this.logger.level,
            String.format(
                "There is(are) %d byte(s) available from %s.",
                avail,
                this.source
            )
        )
        return avail
    }

    @Throws(IOException::class)
    override fun close() {
        this.origin.close()
        this.logger.log(
            this.logger.level,
            String.format(
                "Closed input stream from %s.",
                this.source
            )
        )
    }

    override fun mark(limit: Int) {
        this.origin.mark(limit)
        this.logger.log(
            this.logger.level,
            String.format(
                "Marked position %d from %s.",
                limit,
                this.source
            )
        )
    }

    @Throws(IOException::class)
    override fun reset() {
        this.origin.reset()
        this.logger.log(
            this.logger.level,
            String.format(
                "Reset input stream from %s.",
                this.source
            )
        )
    }

    override fun markSupported(): Boolean {
        val supported = this.origin.markSupported()
        val msg: String
        if (supported) {
            msg = "Mark and reset are supported from %s"
        } else {
            msg = "Mark and reset NOT supported from %s"
        }
        this.logger.log(
            this.logger.level,
            String.format(
                msg,
                this.source
            )
        )
        return supported
    }
}
