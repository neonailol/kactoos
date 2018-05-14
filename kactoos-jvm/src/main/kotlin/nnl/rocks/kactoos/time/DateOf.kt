package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.Date

/**
 * Parser for [Date] instances.
 * Parsing the date using the provided formatter.
 *
 * @param parsed The parsed date
 * @since 0.27
 */
class DateOf(
    private val parsed: Scalar<Date>
) : Scalar<Date> {

    constructor(
        date: CharSequence,
        formatter: DateTimeFormatter
    ) : this(
        Constant { Date.from(LocalDateTime.from(formatter.parse(date)).toInstant(ZoneOffset.UTC)) }
    )

    constructor (
        date: CharSequence
    ) : this(date, Iso().invoke())

    /**
     * Parses the date using the provided format.
     * @param date The date to parse.
     * @param format The format to use.
     */
    constructor(
        date: CharSequence,
        format: String
    ) : this(date, DateTimeFormatter.ofPattern(format))

    override fun invoke(): Date = this.parsed()
}
