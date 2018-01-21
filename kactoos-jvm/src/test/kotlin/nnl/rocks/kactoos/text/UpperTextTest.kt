package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [UpperText].
 *
 *
 * @since 0.1
 *
 */
class UpperTextTest {

    @Test
    fun convertsText() {
        MatcherAssert.assertThat(
            "Can't upper case a text",
            UpperText(TextOf("Hello!")),
            TextHasString("HELLO!")
        )
    }
}
