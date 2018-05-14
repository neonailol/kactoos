package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * Formatter for [LocalDateTime] instances.
 *
 * @since 0.3
 */
class LocalDateTimeAsText(
    private val formatted: KScalar<String>
) : Text {

    /**
     * @param date The date to format.
     * @param formatter The formatter to use.
     */
    constructor(
        date: LocalDateTime,
        formatter: DateTimeFormatter = Iso().invoke()
    ) : this(
         { formatter.format(date.atZone(ZoneId.systemDefault())) }
    )

    /**
     * Formats the date using the provided format string using the provided
     * locale.
     * @param date The date to format.
     * @param format The format string to use.
     * @param locale The locale to use.
     */
    constructor(
        date: LocalDateTime,
        format: String,
        locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) : this(date, DateTimeFormatter.ofPattern(format, locale))

    override fun asString(): String {
        return this.formatted()
    }
}
