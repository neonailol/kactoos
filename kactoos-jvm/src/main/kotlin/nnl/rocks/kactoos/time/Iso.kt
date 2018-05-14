package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.KScalar
import java.time.format.DateTimeFormatter

/**
 * Default formatter
 *
 * @since 0.3
 */
class Iso : KScalar<DateTimeFormatter> {

    override fun invoke(): DateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
}
