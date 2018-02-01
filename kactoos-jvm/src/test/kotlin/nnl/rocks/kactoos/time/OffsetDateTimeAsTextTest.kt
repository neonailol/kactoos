
package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.util.Locale

/**
 * Tests for OffsetDateTimeAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: 18cf273b8d4f9e218ae6f6c82d71c6a7d6f6d595 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class OffsetDateTimeAsTextTest {

    @Test
    fun offsetDateTimeFormattedAsIsoDateTime() {
        val date = OffsetDateTime.of(
                2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
        )
        MatcherAssert.assertThat(
                "Can't format a OffsetDateTime with default/ISO format.",
                OffsetDateTimeAsText(date).asString(),
                Matchers.`is`("2017-12-13T14:15:16.000000017+01:00")
        )
    }

    @Test
    fun offsetDateTimeFormattedWithFormatString() {
        val date = OffsetDateTime.of(
                2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
        )
        MatcherAssert.assertThat(
                "Can't format a OffsetDateTime with format.",
                OffsetDateTimeAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
                Matchers.`is`("2017-12-13 14:15:16")
        )
    }

    @Test
    fun offsetDateTimeFormattedWithFormatStringWithLocale() {
        val date = OffsetDateTime.of(
                2017, 12, 13, 14, 15, 16, 17, ZoneOffset.ofHours(1)
        )
        MatcherAssert.assertThat(
                "Can't format a OffsetDateTime with format using locale.",
                OffsetDateTimeAsText(
                        date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH
                ).asString(),
                Matchers.`is`("2017 déc. 13. 14.15.16")
        )
    }

    @Test
    fun currentOffsetDateTimeAsText() {
        MatcherAssert.assertThat(
                "Can't format a OffsetDateTime with ISO format.",
                OffsetDateTimeAsText(OffsetDateTime.now()).asString(),
                Matchers.notNullValue()
        )
    }
}
