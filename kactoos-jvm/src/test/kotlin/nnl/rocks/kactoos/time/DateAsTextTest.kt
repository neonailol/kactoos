package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

/**
 * Tests for DateAsText.
 *
 *
 * @since 1.0
 *
 *
 */
class DateAsTextTest {

    @Test
    fun formatsCurrentTime() {
        MatcherAssert.assertThat(
            "Can't format current time",
            DateAsText().asString(),
            Matchers.notNullValue()
        )
    }

    @Test
    fun testZonedDateTimeFormattedAsIsoDateTime() {
        val date = ZonedDateTime.of(
            2017, 12, 13, 14, 15, 16, 17, ZoneId.of("Europe/Berlin")
        )
        MatcherAssert.assertThat(
            "Can't format a ZonedDateTime with default/ISO format.",
            DateAsText(date).asString(),
            Matchers.`is`("2017-12-13T14:15:16.000000017+01:00")
        )
    }

    @Test
    fun testZonedDateTimeFormattedWithFormatString() {
        val date = ZonedDateTime.of(
            2017, 12, 13, 14, 15, 16, 17, ZoneId.of("Europe/Berlin")
        )
        MatcherAssert.assertThat(
            "Can't format a ZonedDateTime with format.",
            DateAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
            Matchers.`is`("2017-12-13 14:15:16")
        )
    }

    @Test
    fun testZonedDateTimeFormattedWithFormatStringWithLocale() {
        val date = ZonedDateTime.of(
            2017, 12, 13, 14, 15, 16, 17, ZoneId.of("Europe/Berlin")
        )
        MatcherAssert.assertThat(
            "Can't format a ZonedDateTime with format using locale.",
            DateAsText(date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH)
                .asString(),
            Matchers.`is`("2017 déc. 13. 14.15.16")
        )
    }

    @Test
    fun testDateFormattedUsingIsoFormatter() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.set(2017, Calendar.DECEMBER, 13, 14, 15, 16)
        calendar.set(Calendar.MILLISECOND, 17)
        MatcherAssert.assertThat(
            "Can't format a java.util.Date with ISO format.",
            DateAsText(calendar.time).asString(),
            Matchers.`is`("2017-12-13T14:15:16.017Z")
        )
    }

    @Test
    fun testDateFormattedUsingCustomFormat() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.set(2017, Calendar.DECEMBER, 13, 14, 15, 16)
        MatcherAssert.assertThat(
            "Can't format a java.util.Date with custom format.",
            DateAsText(
                calendar.time, "yyyy MM dd hh:mm:ss"
            ).asString(),
            Matchers.`is`("2017 12 13 02:15:16")
        )
    }

    @Test
    fun testDateFormattedUsingCustomFormatDifferentLocale() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.set(2017, Calendar.DECEMBER, 13, 14, 15, 16)
        MatcherAssert.assertThat(
            "Can't format a java.util.Date with custom format.",
            DateAsText(
                calendar.time, "yyyy MMM dd hh:mm:ss", Locale.ITALIAN
            ).asString(),
            Matchers.`is`("2017 dic 13 02:15:16")
        )
    }

    @Test
    fun testMillisFormattedUsingIsoFormatter() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.set(2017, Calendar.DECEMBER, 13, 14, 15, 16)
        calendar.set(Calendar.MILLISECOND, 17)
        MatcherAssert.assertThat(
            "Can't format a java.util.Date with ISO format.",
            DateAsText(calendar.time.time).asString(),
            Matchers.`is`("2017-12-13T14:15:16.017Z")
        )
    }

    @Test
    fun testMillisFormattedUsingCustomFormat() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.set(2017, Calendar.DECEMBER, 13, 14, 15, 16)
        MatcherAssert.assertThat(
            "Can't format a java.util.Date with custom format.",
            DateAsText(
                calendar.time.time,
                "yyyy MM dd hh:mm:ss"
            ).asString(),
            Matchers.`is`("2017 12 13 02:15:16")
        )
    }

    @Test
    fun testMillisFormattedUsingCustomFormatDifferentLocale() {
        val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
        calendar.set(2017, Calendar.DECEMBER, 13, 14, 15, 16)
        MatcherAssert.assertThat(
            "Can't format a java.util.Date with custom format.",
            DateAsText(
                calendar.time.time,
                "yyyy MMMM dd hh:mm:ss",
                Locale.US
            ).asString(),
            Matchers.`is`("2017 December 13 02:15:16")
        )
    }
}
