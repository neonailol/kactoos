
package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.text.MessageFormat
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.util.Locale

/**
 * Tests for LocalDateAsText.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: a0b8ed01fc8fd38a1230e4eb22519de3b89940a1 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class LocalDateAsTextTest {

    @Test
    fun localDateFormattedAsIsoDateTime() {
        val date = LocalDate.of(2017, 12, 13)
        MatcherAssert.assertThat(
                "Can't format a LocalDate with default/ISO format.",
                LocalDateAsText(date).asString(),
                Matchers.`is`(
                        MessageFormat.format(
                                "2017-12-13T00:00:00{0}",
                                date.atTime(LocalTime.MIN).atZone(ZoneId.systemDefault())
                                        .offset.toString()
                        )
                )
        )
    }

    @Test
    fun localDateFormattedWithFormatString() {
        val date = LocalDate.of(2017, 12, 13)
        MatcherAssert.assertThat(
                "Can't format a LocalDate with format.",
                LocalDateAsText(date, "yyyy-MM-dd HH:mm:ss").asString(),
                Matchers.`is`("2017-12-13 00:00:00")
        )
    }

    @Test
    fun localDateFormattedWithFormatStringWithLocale() {
        val date = LocalDate.of(2017, 12, 13)
        MatcherAssert.assertThat(
                "Can't format a LocalDate with format using locale.",
                LocalDateAsText(
                        date, "yyyy MMM dd. HH.mm.ss", Locale.FRENCH
                ).asString(),
                Matchers.`is`("2017 déc. 13. 00.00.00")
        )
    }

    @Test
    fun currentLocalDateAsText() {
        MatcherAssert.assertThat(
                "Can't format a LocalDate with ISO format.",
                LocalDateAsText(LocalDate.now()).asString(),
                Matchers.notNullValue()
        )
    }
}
