package nnl.rocks.kactoos.time

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.scalar.Constant
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Parser for [LocalDateTime] instances.
 * Parses the date using the formatter to create
 * [LocalDateTime] instances.
 *
 * @param parsed The parsed date.
 * @since 0.27
 */
class LocalDateTimeOf(
    private val parsed: Scalar<LocalDateTime>
) : Scalar<LocalDateTime> {

    constructor(
        date: CharSequence
    ) : this(Constant { LocalDateTime.from(Iso().get().parse(date)) })

    constructor(
        date: CharSequence,
        formatter: DateTimeFormatter
    ) : this(Constant { LocalDateTime.from(formatter.parse(date)) })

    /**
     * Parses date using the provided format to create
     * [LocalDateTime] instances.
     * @param date The date to parse.
     * @param format The format to use.
     */
    constructor(
        date: CharSequence,
        format: String
    ) : this(date, DateTimeFormatter.ofPattern(format))

    override fun invoke(): LocalDateTime = this.parsed()
}
