
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.list.ListOf
import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

import java.io.IOException
import java.io.Serializable
import java.util.Calendar
import java.util.IllegalFormatConversionException
import java.util.Locale
import java.util.UnknownFormatConversionException

/**
 * Test case for [FormattedText].
 *
 * @author Andriy Kryvtsun (kontiky@gmail.com)
 * @author Ix (ixmanuel@yahoo.com)
 * @version $Id: 4c638224f20834b6307498d06f838be768dc708c $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class FormattedTextTest {

    @Test
    fun formatsText() {
        MatcherAssert.assertThat(
                "Can't format a text",
                FormattedText(
                        "%d. Formatted %s", 1, "text"
                ),
                TextHasString("1. Formatted text")
        )
    }

    @Test
    fun formatsTextWithObjects() {
        MatcherAssert.assertThat(
                "Can't format a text with objects",
                FormattedText(
                        TextOf("%d. Number as %s"),
                        1,
                        "string"
                ),
                TextHasString("1. Number as string")
        )
    }

    @Test(expected = UnknownFormatConversionException::class)
    @Throws(IOException::class)
    fun failsForInvalidPattern() {
        FormattedText(
                TextOf("%%. Formatted %$"),
                ListOf<java.io.Serializable>(1, "invalid")
        ).asString()
    }

    @Test
    fun formatsTextWithCollection() {
        MatcherAssert.assertThat(
                "Can't format a text with a collection",
                FormattedText(
                        TextOf("%d. Formatted as %s"),
                        ListOf<Serializable>(1, "txt")
                ),
                TextHasString("1. Formatted as txt")
        )
    }

    @Test(expected = IllegalFormatConversionException::class)
    @Throws(IOException::class)
    fun ensuresThatFormatterFails() {
        FormattedText(
                TextOf("Local time: %d"),
                Locale.ROOT,
                Calendar.getInstance()
        ).asString()
    }

    @Test
    fun formatsWithLocale() {
        MatcherAssert.assertThat(
                "Can't format a text with Locale",
                FormattedText(
                        // @checkstyle MagicNumber (1 line)
                        "%,d", Locale.GERMAN, 1234567890
                ),
                TextHasString("1.234.567.890")
        )
    }

    @Test
    fun formatsWithText() {
        MatcherAssert.assertThat(
                "Can't format a string with text",
                FormattedText(
                        "Format with text: %s",
                        TextOf("kactoos")
                ),
                TextHasString("Format with text: kactoos")
        )
    }
}
