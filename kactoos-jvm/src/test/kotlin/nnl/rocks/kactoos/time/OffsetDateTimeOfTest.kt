package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset

/**
 * Tests for [OffsetDateTimeOf].
 *
 *
 * @since 1.0
 *
 *
 */
class OffsetDateTimeOfTest {

    @Test
    fun testParsingIsoFormattedStringToOffsetDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a OffsetDateTime with default/ISO format.",
            OffsetDateTimeOf("2017-12-13T14:15:16.000000017+01:00").value(),
            Matchers.`is`(
                OffsetDateTime.of(
                    2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
                )
            )
        )
    }

    @Test
    fun testParsingFormattedStringWithOffsetToOffsetDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a OffsetDateTime with custom format.",
            OffsetDateTimeOf(
                "2017-12-13 14:15:16",
                "yyyy-MM-dd HH:mm:ss",
                ZoneOffset.ofHours(1)
            ).value(),
            Matchers.`is`(
                OffsetDateTime.of(
                    LocalDateTime.of(2017, 12, 13, 14, 15, 16),
                    ZoneOffset.ofHours(1)
                )
            )
        )
    }
}
