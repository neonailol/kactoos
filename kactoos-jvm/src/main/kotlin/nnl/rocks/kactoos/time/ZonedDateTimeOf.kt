package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * Parser for [ZonedDateTime] instances.
 *
 * Parses the date using the formatter to create [ZonedDateTime] instances.
 *
 * @param parsed The parsed date.
 * @since 0.27
 */
class ZonedDateTimeOf(
    private val parsed: Scalar<ZonedDateTime>
) : Scalar<ZonedDateTime> {

    /**
     * @param date The date to parse.
     * @param formatter The formatter to use.
     * */
    constructor(
        date: CharSequence,
        formatter: DateTimeFormatter
    ) : this(
        Constant {
            ZonedDateTime.from(formatter.parse(date))
        }
    )

    /**
     * @param date The date to parse.
     * */
    constructor(date: CharSequence) : this(
        Constant {
            ZonedDateTime.from(Iso().get().parse(date))
        }
    )

    /**
     * Parses date using the provided format to create [ZonedDateTime] instances.
     * @param date The date to parse.
     * @param format The format to use.
     * @param zone The zone to use.
     */
    constructor(
        date: CharSequence,
        format: String,
        zone: ZoneId
    ) : this(date, DateTimeFormatter.ofPattern(format).withZone(zone))

    override fun invoke(): ZonedDateTime = this.parsed()
}
