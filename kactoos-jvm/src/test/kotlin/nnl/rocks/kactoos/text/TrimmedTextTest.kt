package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [TrimmedText].
 *
 *
 * @since 0.1
 *
 */
class TrimmedTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
            "Can't trim a text",
            TrimmedText(TextOf("  Hello!   \t ")),
            TextHasString("Hello!")
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        MatcherAssert.assertThat(
            "Can't trim a blank text",
            TrimmedText(TextOf("  \t ")),
            TextHasString("")
        )
    }
}
