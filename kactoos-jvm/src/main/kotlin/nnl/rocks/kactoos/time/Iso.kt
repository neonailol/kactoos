package nnl.rocks.kactoos.time

import java.time.format.DateTimeFormatter

/**
 * Default formatter
 *
 * @since 0.27
 */
class Iso {

    /**
     * Take it.
     * @return Formatter
     */
    fun get(): DateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
}
