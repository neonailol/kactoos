package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.File
import java.net.URI

/**
 * Test case for [InputWithFallback].
 *
 *
 *
 * @since 0.9
 *
 */
class InputWithFallbackTest {

    @Test
    fun readsAlternativeInput() {
        MatcherAssert.assertThat(
            "Can't read alternative source",
            TextOf(
                InputWithFallback(
                    InputOf(
                        File("/this-file-is-absent-for-sure.txt")
                    ),
                    InputOf("hello, world!")
                )
            ),
            TextHasString(Matchers.endsWith("world!"))
        )
    }

    @Test
    fun readsAlternativeInputUri() {
        MatcherAssert.assertThat(
            "Can't read alternative source from URI",
            TextOf(
                InputWithFallback(
                    StickyInput(
                        InputOf(
                            URI.create("http://www.cactoos.org/path-is-absent")
                        )
                    ),
                    InputOf("it works!")
                )
            ),
            TextHasString(Matchers.endsWith("works!"))
        )
    }
}
