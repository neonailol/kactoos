
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.text.JoinedText
import nnl.rocks.kactoos.text.UncheckedText

import java.util.LinkedList
import java.util.logging.Handler
import java.util.logging.Level
import java.util.logging.LogRecord
import java.util.logging.Logger

/**
 * Fake logger.
 *
 *
 * There is no thread-safety guarantee.
 *
 * @author Fabricio Cabral (fabriciofx@gmail.com)
 * @version $Id: 0ea10e01db88ff5ad6adc70f82553917962d162c $
 * @since 0.29
 */
class FakeLogger
/**
 * Ctor.
 * @param name Logger name
 * @param lvl Logging level
 */
@JvmOverloads constructor(
        name: String,
        lvl: Level = Level.INFO
) : Logger(name, null) {

    /**
     * Ctor.
     * @param lvl Logging level
     */
    @JvmOverloads constructor(lvl: Level = Level.INFO) : this("FakeLogger", lvl)

    init {
        this.useParentHandlers = false
        this.addHandler(FakeHandler())
        this.level = lvl
    }

    override fun toString(): String {
        return this.handlers[0].toString()
    }

    /**
     * Fake handler logger.
     *
     *
     * There is no thread-safety guarantee.
     *
     * @author Fabricio Cabral (fabriciofx@gmail.com)
     * @version $Id: 0ea10e01db88ff5ad6adc70f82553917962d162c $
     * @since 0.29
     */
    private class FakeHandler
    /**
     * Ctor.
     */
    internal constructor() : Handler() {

        /**
         * Lines.
         */
        private val entries: MutableList<String>

        init {
            this.entries = LinkedList()
        }

        override fun publish(record: LogRecord) {
            this.entries.add(record.message)
        }

        override fun close() {
            // Intended empty.
        }

        override fun flush() {
            // Intended empty.
        }

        override fun toString(): String {
            return UncheckedText(
                    JoinedText(
                            System.lineSeparator(),
                            this.entries
                    )
            ).asString()
        }
    }
}
/**
 * Ctor.
 */
/**
 * Ctor.
 * @param name Logger name
 */
