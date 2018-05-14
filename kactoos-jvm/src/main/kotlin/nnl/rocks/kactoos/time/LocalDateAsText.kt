package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * Formatter for [LocalDate] instances.
 *
 * @param date The date to format.
 * @param formatter The formatter to use.
 * @since 0.3
 */
class LocalDateAsText constructor(
    private val formatted: KScalar<String>
) : Text {

    constructor(
        date: LocalDate,
        formatter: DateTimeFormatter = Iso().invoke()
    ) : this(
         {
            formatter.format(
                ZonedDateTime.of(date, LocalTime.MIN, ZoneId.systemDefault())
            )
        }
    )

    /**
     * Formats the date using the provided format string using the provided
     * locale.
     * @param date The date to format.
     * @param format The format string to use.
     * @param locale The locale to use.
     */
    constructor(
        date: LocalDate,
        format: String,
        locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) : this(date, DateTimeFormatter.ofPattern(format, locale))

    override fun asString(): String {
        return this.formatted()
    }
}
