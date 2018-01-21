package nnl.rocks.kactoos

import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [Text].
 *
 *
 * @since 0.11
 *
 */
class TextTest {

    @Test
    @Throws(Exception::class)
    fun okForNoNulls() {
        val message = "Hello"
        MatcherAssert.assertThat(
            "Can't work with null text",
            TextOf(message),
            TextHasString(message)
        )
    }
}
