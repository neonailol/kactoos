package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * Parser for [OffsetDateTime] instances.
 * Parses the date using the formatter to create
 * [OffsetDateTime] instances.
 *
 * @param parsed The parsed date.
 * @since 0.27
 */
class OffsetDateTimeOf(
    private val parsed: Scalar<OffsetDateTime>
) : Scalar<OffsetDateTime> {

    constructor(
        date: CharSequence
    ) : this(Constant { ZonedDateTime.from(Iso().get().parse(date)).toOffsetDateTime() })

    constructor(
        date: CharSequence,
        formatter: DateTimeFormatter
    ) : this(Constant { ZonedDateTime.from(formatter.parse(date)).toOffsetDateTime() })

    /**
     * Parses date using the provided format to create
     * [OffsetDateTime] instances.
     * @param date The date to parse.
     * @param format The format to use.
     * @param offset The offset to use.
     */
    constructor(
        date: CharSequence,
        format: String,
        offset: ZoneOffset
    ) : this(
        date,
        DateTimeFormatter.ofPattern(format).withZone(offset.normalized())
    )

    override fun invoke(): OffsetDateTime = this.parsed()
}
