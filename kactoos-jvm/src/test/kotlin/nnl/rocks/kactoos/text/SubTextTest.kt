package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [SubText].
 *
 *
 * @since 0.11
 *
 */
class SubTextTest {

    @Test
    fun cutTextWithStartAndEnd() {
        MatcherAssert.assertThat(
            "Can't cut a text with start and end",
            SubText("hello world", 2, 50),
            TextHasString("llo world")
        )
    }

    @Test
    fun cutTextWithStart() {
        MatcherAssert.assertThat(
            "Can't cut a text with start",
            SubText("cut here", 2),
            TextHasString("t here")
        )
    }
}
