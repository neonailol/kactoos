package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [TrimmedLeftText].
 *
 *
 * @since 0.12
 *
 */
class TrimmedLeftTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
            "Can't left trim a text",
            TrimmedLeftText(TextOf("  Hello!   \t ")),
            TextHasString("Hello!   \t ")
        )
    }

    @Test
    fun trimmedBlankTextIsEmptyText() {
        MatcherAssert.assertThat(
            "Can't trim a blank text",
            TrimmedLeftText(TextOf("  \t ")),
            TextHasString("")
        )
    }
}
