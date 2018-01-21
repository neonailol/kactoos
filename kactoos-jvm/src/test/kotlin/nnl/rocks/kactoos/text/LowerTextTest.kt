package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [LowerText].
 *
 *
 * @since 0.11
 *
 */
class LowerTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
            "Can't lower case a text",
            LowerText(TextOf("HelLo!")),
            TextHasString("hello!")
        )
    }
}
