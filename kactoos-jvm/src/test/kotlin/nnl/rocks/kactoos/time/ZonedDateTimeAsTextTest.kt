
package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.Locale

/**
 * Tests for ZonedDateTimeAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: 4cd9906c4c376e3de826abe0f982a3c66546aea3 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class ZonedDateTimeAsTextTest {

    @Test
    fun zonedDateTimeFormattedAsIsoDateTime() {
        val date = ZonedDateTime.of(
                2017, 12, 13, 14, 15, 16, 17, ZoneId.of("Europe/Berlin")
        )
        MatcherAssert.assertThat(
                "Can't format a ZonedDateTime with default/ISO format.",
                ZonedDateTimeAsText(date).asString(),
                Matchers.`is`("2017-12-13T14:15:16.000000017+01:00")
        )
    }

    @Test
    fun zonedDateTimeFormattedWithFormatString() {
        val date = ZonedDateTime.of(
                2017, 12, 13, 14, 15, 16, 17, ZoneId.of("Europe/Berlin")
        )
        MatcherAssert.assertThat(
                "Can't format a ZonedDateTime with format.",
                ZonedDateTimeAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
                Matchers.`is`("2017-12-13 14:15:16")
        )
    }

    @Test
    fun zonedDateTimeFormattedWithFormatStringWithLocale() {
        val date = ZonedDateTime.of(
                2017, 12, 13, 14, 15, 16, 17, ZoneId.of("Europe/Berlin")
        )
        MatcherAssert.assertThat(
                "Can't format a ZonedDateTime with format using locale.",
                ZonedDateTimeAsText(
                        date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH
                ).asString(),
                Matchers.`is`("2017 déc. 13. 14.15.16")
        )
    }

    @Test
    fun currentZonedDateTimeAsText() {
        MatcherAssert.assertThat(
                "Can't format a ZonedDateTime with ISO format.",
                ZonedDateTimeAsText(ZonedDateTime.now()).asString(),
                Matchers.notNullValue()
        )
    }
}
