package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * Tests for [ZonedDateTimeOf].
 *
 *
 * @since 1.0
 *
 *
 */
class ZonedDateTimeOfTest {

    @Test
    fun testParsingIsoFormattedStringToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with default/ISO format.",
            ZonedDateTimeOf("2017-12-13T14:15:16.000000017+01:00", Iso().get()).value(),
            Matchers.equalTo(
                ZonedDateTime.of(
                    2017, 12, 13, 14, 15, 16, 17,
                    ZoneId.ofOffset("", ZoneOffset.ofHours(1))
                )
            )
        )
    }

    @Test
    fun testParsingDefaultFormattedStringToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with default format.",
            ZonedDateTimeOf("2017-12-13T14:15:16.000000017+01:00").value(),
            Matchers.equalTo(
                ZonedDateTime.of(
                    2017, 12, 13, 14, 15, 16, 17,
                    ZoneId.ofOffset("", ZoneOffset.ofHours(1))
                )
            )
        )
    }

    @Test
    fun testParsingFormattedStringWithZoneToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with custom format and zone.",
            ZonedDateTimeOf(
                "2017-12-13 14:15:16",
                "yyyy-MM-dd HH:mm:ss",
                ZoneId.of("Europe/Berlin")
            ).value(),
            Matchers.`is`(
                ZonedDateTime.of(
                    LocalDateTime.of(2017, 12, 13, 14, 15, 16),
                    ZoneId.of("Europe/Berlin")
                )
            )
        )
    }

    @Test
    fun testParsingFormattedStringWithFormatterToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with custom format and zone.",
            ZonedDateTimeOf(
                "2017-12-13 14:15:16",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                    .withZone(ZoneId.of("Europe/Berlin"))
            ).value(),
            Matchers.`is`(
                ZonedDateTime.of(
                    LocalDateTime.of(2017, 12, 13, 14, 15, 16),
                    ZoneId.of("Europe/Berlin")
                )
            )
        )
    }
}
