package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Text
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

/**
 * Formatter for [OffsetDateTime] instances.
 *
 * @since 0.3
 */
class OffsetDateTimeAsText constructor(
    private val formatted: KScalar<String>
) : Text {

    constructor(
        date: OffsetDateTime,
        formatter: DateTimeFormatter = Iso().invoke()
    ) : this(
        { formatter.format(date) }
    )

    /**
     * Formats the date using the provided format string using the provided
     * locale.
     * @param date The date to format.
     * @param format The format string to use.
     * @param locale The locale to use.
     */
    constructor(
        date: OffsetDateTime,
        format: String,
        locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) : this(date, DateTimeFormatter.ofPattern(format, locale))

    override fun asString(): String {
        return this.formatted()
    }
}
