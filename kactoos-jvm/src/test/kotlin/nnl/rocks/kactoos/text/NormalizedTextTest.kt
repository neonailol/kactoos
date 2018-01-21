package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException

/**
 * Test case for [NormalizedText].
 *
 *
 * @since 0.9
 *
 */
class NormalizedTextTest {

    @Test
    @Throws(IOException::class)
    fun normalizesText() {
        MatcherAssert.assertThat(
            "Can't normalize a text",
            NormalizedText(" \t hello  \t\tworld   \t"),
            TextHasString("hello world")
        )
    }
}
