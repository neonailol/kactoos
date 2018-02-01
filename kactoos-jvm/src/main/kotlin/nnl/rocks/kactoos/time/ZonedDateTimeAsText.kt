package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.ScalarOf
import nnl.rocks.kactoos.scalar.UncheckedScalar

import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * Formatter for [ZonedDateTime] instances.
 * @param date The date to format.
 * @param formatter The formatter to use.
 * @since 0.3
 */
class ZonedDateTimeAsText @JvmOverloads constructor(
    date: ZonedDateTime,
    formatter: DateTimeFormatter = Iso().get()
) : Text {

    /**
     * Scalar carrying the formatted date.
     */
    private val formatted: UncheckedScalar<String> = UncheckedScalar(
        ScalarOf { formatter.format(date) }
    )

    /**
     * Formats the date using the provided format string using the provided
     * locale.
     * @param date The date to format.
     * @param format The format string to use.
     * @param locale The locale to use.
     */
    @JvmOverloads constructor(
        date: ZonedDateTime,
        format: String,
        locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) : this(date, DateTimeFormatter.ofPattern(format, locale))

    override fun asString(): String {
        return this.formatted.value()
    }
}
