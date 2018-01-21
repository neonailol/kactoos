package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [ReversedText].
 *
 *
 *
 * @since 0.2
 *
 */
class ReversedTextTest {

    @Test
    fun reverseText() {
        MatcherAssert.assertThat(
            "Can't reverse a text",
            ReversedText(
                TextOf("Hello!")
            ),
            TextHasString("!olleH")
        )
    }

    @Test
    fun reversedEmptyTextIsEmptyText() {
        MatcherAssert.assertThat(
            "Can't reverse empty text",
            ReversedText(
                TextOf("")
            ),
            TextHasString("")
        )
    }
}
