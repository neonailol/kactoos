
package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.text.MessageFormat
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.Locale

/**
 * Tests for LocalDateTimeAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: beb727169a9a3f88b348d7fd6bd753b182fbdb2d $
 * @since 0.28
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class LocalDateTimeAsTextTest {

    @Test
    fun localDateTimeFormattedAsIsoDateTime() {
        val date = LocalDateTime.of(
                2017, 12, 13, 14, 15, 16, 17
        )
        MatcherAssert.assertThat(
                "Can't format a LocalDateTime with default/ISO format.",
                LocalDateTimeAsText(date).asString(),
                Matchers.`is`(
                        MessageFormat.format(
                                "2017-12-13T14:15:16.000000017{0}",
                                date.atZone(ZoneId.systemDefault()).offset.toString()
                        )
                )
        )
    }

    @Test
    fun localDateTimeFormattedWithFormatString() {
        val date = LocalDateTime.of(
                2017, 12, 13, 14, 15, 16, 17
        )
        MatcherAssert.assertThat(
                "Can't format a LocalDateTime with format.",
                LocalDateTimeAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
                Matchers.`is`("2017-12-13 14:15:16")
        )
    }

    @Test
    fun localDateTimeFormattedWithFormatStringWithLocale() {
        val date = LocalDateTime.of(
                2017, 12, 13, 14, 15, 16, 17
        )
        MatcherAssert.assertThat(
                "Can't format a LocalDateTime with format using locale.",
                LocalDateTimeAsText(
                        date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH
                ).asString(),
                Matchers.`is`("2017 déc. 13. 14.15.16")
        )
    }

    @Test
    fun currentLocalDateTimeAsText() {
        MatcherAssert.assertThat(
                "Can't format a LocalDateTime with ISO format.",
                LocalDateTimeAsText(LocalDateTime.now()).asString(),
                Matchers.notNullValue()
        )
    }
}
