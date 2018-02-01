
package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.Calendar
import java.util.Locale
import java.util.TimeZone

/**
 * Tests for DateAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: dbcc31a2b732a73f79558c32cc121a4c0974143e $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
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
    fun dateFormattedUsingIsoFormatter() {
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
    fun dateFormattedUsingCustomFormat() {
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
    fun dateFormattedUsingCustomFormatDifferentLocale() {
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
    fun millisFormattedUsingIsoFormatter() {
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
    fun millisFormattedUsingCustomFormat() {
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
    fun millisFormattedUsingCustomFormatDifferentLocale() {
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
