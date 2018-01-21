package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [TrimmedRightText].
 *
 *
 * @since 0.12
 *
 */
class TrimmedRightTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
            "Can't right trim a text",
            TrimmedRightText(TextOf("  Hello!   \t ")),
            TextHasString("  Hello!")
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        MatcherAssert.assertThat(
            "Can't trim a blank text",
            TrimmedRightText(TextOf("  \t ")),
            TextHasString("")
        )
    }
}
