package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.UncheckedScalar

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
class LocalDateAsText @JvmOverloads constructor(
    date: LocalDate,
    formatter: DateTimeFormatter = Iso().get()
) : Text {

    /**
     * Scalar carrying the formatted date.
     */
    private val formatted: UncheckedScalar<String> = UncheckedScalar(
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
    @JvmOverloads constructor(
        date: LocalDate,
        format: String,
        locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) : this(date, DateTimeFormatter.ofPattern(format, locale))

    override fun asString(): String {
        return this.formatted.value()
    }
}
