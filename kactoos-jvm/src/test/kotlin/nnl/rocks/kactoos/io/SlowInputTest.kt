
package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.nio.charset.StandardCharsets

/**
 * Test case for [SlowInput].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @author Ix (ixmanuel@yahoo.com)
 * @version $Id: e3957cf277c3532f60926afe8941228f8396d1cf $
 * @since 0.12
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class SlowInputTest {

    @Test
    fun calculatesLength() {
        val text = "What's up, друг?"
        MatcherAssert.assertThat(
                "Can't calculate the length of Input",
                LengthOf(
                        SlowInput(
                                InputOf(
                                        TextOf(text)
                                )
                        )
                ).toInt(),
                Matchers.equalTo(text.toByteArray(StandardCharsets.UTF_8).size)
        )
    }

    @Test
    fun readsFileContentSlowly() {
        val size = 100_000L
        MatcherAssert.assertThat(
                "Can't calculate length if the input is slow",
                LengthOf(
                        SlowInput(size)
                ).toLong(),
                Matchers.equalTo(size)
        )
    }
}
