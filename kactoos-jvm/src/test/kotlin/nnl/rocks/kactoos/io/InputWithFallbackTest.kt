package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.matchers.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.File
import java.io.IOException

/**
 * Test case for [InputWithFallback].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: edc88d81e8a9f0cdbb3f75ff16f8b50e2d37c195 $
 * @since 0.9
 * @checkstyle JavadocMethodCheck (500 lines)
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
        MatcherAssert.assertThat<TextOf>(
            "Can't read alternative source from URI",
            TextOf(
                InputWithFallback(
                    InputOf("it works!"),
                    { throw IOException("Always fails!") }
                )
            ),
            TextHasString(Matchers.endsWith("works!"))
        )
    }
}
