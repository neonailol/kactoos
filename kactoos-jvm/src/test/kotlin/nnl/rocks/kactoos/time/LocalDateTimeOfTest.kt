
package nnl.rocks.kactoos.time

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Tests for [LocalDateTimeOf].
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: c7620d0e35bf026d89543f0f56e262d569ce6c66 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
class LocalDateTimeOfTest {

    @Test
    fun testParsingIsoFormattedStringToLocalDateTime() {
        MatcherAssert.assertThat(
                "Can't parse a LocalDateTime with default/ISO format.",
                LocalDateTimeOf("2017-12-13T14:15:16.000000017+01:00").value(),
                Matchers.`is`(LocalDateTime.of(2017, 12, 13, 14, 15, 16, 17))
        )
    }

    @Test
    fun testParsingFormattedStringWithFormatToLocalDateTime() {
        MatcherAssert.assertThat(
                "Can't parse a LocalDateTime with custom format.",
                LocalDateTimeOf(
                        "2017-12-13 14:15:16.000000017",
                        "yyyy-MM-dd HH:mm:ss.n"
                ).value(),
                Matchers.`is`(LocalDateTime.of(2017, 12, 13, 14, 15, 16, 17))
        )
    }

    @Test
    fun testParsingFormattedStringWithFormatterToLocalDateTime() {
        MatcherAssert.assertThat(
                "Can't parse a LocalDateTime with custom formatter.",
                LocalDateTimeOf(
                        "2017-12-13 14:15:16.000000017",
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.n")
                ).value(),
                Matchers.`is`(LocalDateTime.of(2017, 12, 13, 14, 15, 16, 17))
        )
    }
}
