package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Text

import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

/**
 * Formatter for [Date] instances.
 *
 * @param date The date to format.
 * @param formatter The formatter to use.
 * @since 0.3
 */
class DateAsText(
    private val text: ZonedDateTimeAsText
) : Text {

    constructor(date: ZonedDateTime) : this(
        ZonedDateTimeAsText(
            date
        )
    )

    constructor(
        date: Date,
        formatter: DateTimeFormatter
    ) : this(
        ZonedDateTimeAsText(
            ZonedDateTime.ofInstant(date.toInstant(), ZoneId.of("UTC")),
            formatter
        )
    )

    constructor(date: Date) : this(date, Iso().get())

    /**
     * Formats the milliseconds using the ISO format.
     * @param milliseconds Milliseconds to format.
     */
    @JvmOverloads constructor(milliseconds: Long = System.currentTimeMillis()) : this(
        Date.from(Instant.ofEpochMilli(milliseconds)),
        Iso().get()
    )

    /**
     * Formats the milliseconds using the format and the default locale.
     * @param milliseconds Milliseconds to format.
     * @param format The format to use.
     */
    constructor(
        milliseconds: Long,
        format: String
    ) : this(
        Date.from(Instant.ofEpochMilli(milliseconds)), format,
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
        Date.from(Instant.ofEpochMilli(milliseconds)),
        DateTimeFormatter.ofPattern(format, locale)
    )

    constructor(
        date: ZonedDateTime,
        format: String,
        locale: Locale
    ) : this(
        date,
        DateTimeFormatter.ofPattern(format, locale)
    )

    constructor(
        date: ZonedDateTime,
        formatter: DateTimeFormatter
    ) : this(
        ZonedDateTimeAsText(
            date,
            formatter
        )
    )

    /**
     * Formats the date using the format and locale using the system default
     * zone.
     * @param date The date to format.
     * @param format The format to use.
     * @param locale The locale to use.
     */
    @JvmOverloads constructor(
        date: Date,
        format: String,
        locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) : this(date, DateTimeFormatter.ofPattern(format, locale))

    override fun asString(): String {
        return this.text.asString()
    }

    constructor(
        date: ZonedDateTime,
        format: String
    ) : this(date, format, Locale.getDefault(Locale.Category.FORMAT))
}
