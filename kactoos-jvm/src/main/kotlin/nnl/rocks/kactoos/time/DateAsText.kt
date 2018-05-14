package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.scalar.Constant
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalAccessor
import java.util.Date
import java.util.Locale

/**
 * Formatter for date instances.
 * Formats the date using the provided formatter.
 *
 * @param formatted The formatted date.
 * @since 0.27
 */
class DateAsText(
    private val formatted: Scalar<String>
) : Text {

    constructor(
        date: TemporalAccessor,
        formatter: DateTimeFormatter
    ) : this(Constant { formatter.format(date) })

    constructor(
        date: TemporalAccessor
    ) : this(Constant { Iso().invoke().format(date) })

    /**
     * Formats the milliseconds using the ISO format.
     * @param milliseconds Milliseconds to format.
     */
    constructor(milliseconds: Long) : this(
        ZonedDateTime.ofInstant(
            Instant.ofEpochMilli(milliseconds), ZoneId.of("UTC")
        ),
        Iso().invoke()
    )

    constructor() : this(System.currentTimeMillis())

    /**
     * Formats the milliseconds using the format and the default locale.
     * @param milliseconds Milliseconds to format.
     * @param format The format to use.
     */
    constructor(
        milliseconds: Long,
        format: String
    ) : this(
        ZonedDateTime.ofInstant(
            Instant.ofEpochMilli(milliseconds), ZoneId.of("UTC")
        ),
        format,
        Locale.getDefault(Locale.Category.FORMAT)
    )

    /**
     * Formats the milliseconds as date using the format and the locale.
     * @param milliseconds Milliseconds to format as date.
     * @param format The format to use.
     * @param locale The locale to use for the format.
     */
    constructor(
        milliseconds: Long,
        format: String,
        locale: Locale
    ) : this(
        ZonedDateTime.ofInstant(
            Instant.ofEpochMilli(milliseconds), ZoneId.of("UTC")
        ),
        DateTimeFormatter.ofPattern(format, locale)
    )

    /**
     * Formats the date with ISO format using the system zone.
     * @param date The date to format.
     */
    constructor(date: Date) : this(
        ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC")),
        Iso().invoke()
    )

    /**
     * Formats the date with to format using the default locale and the system
     * zone.
     * @param date The date to format.
     * @param format The format to use.
     */
    constructor(
        date: Date,
        format: String
    ) : this(
        ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC")),
        DateTimeFormatter.ofPattern(
            format,
            Locale.getDefault(Locale.Category.FORMAT)
        )
    )

    /**
     * Formats the date using the format and locale using the system default
     * zone.
     * @param date The date to format.
     * @param format The format to use.
     * @param locale The locale to use.
     */
    constructor(
        date: Date,
        format: String,
        locale: Locale
    ) : this(
        ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC")),
        DateTimeFormatter.ofPattern(format, locale)
    )

    /**
     * Formats the date using the provided format string using the provided
     * locale.
     * @param date The date to format.
     * @param format The format string to use.
     * @param locale The locale to use.
     */
    constructor(
        date: TemporalAccessor,
        format: String,
        locale: Locale
    ) : this(
        date, DateTimeFormatter.ofPattern(format, locale)
    )

    constructor(
        date: TemporalAccessor,
        format: String
    ) : this(
        date, DateTimeFormatter.ofPattern(format, Locale.getDefault(Locale.Category.FORMAT))
    )

    override fun asString(): String = this.formatted()
}
