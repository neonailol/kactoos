package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.JoinedText
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [Reversed].
 *
 *
 * @since 0.9
 *
 */
class ReversedTest {

    @Test
    fun reversesIterable() {
        MatcherAssert.assertThat(
            "Can't reverse an iterable",
            JoinedText(
                " ",
                Reversed(
                    IterableOf(
                        "hello", "world", "dude"
                    )
                )
            ),
            TextHasString("dude world hello")
        )
    }
}
