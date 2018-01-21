package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [UncheckedText].
 *
 *
 *
 * @since 0.3
 *
 */
class UncheckedTextTest {

    @Test(expected = RuntimeException::class)
    fun rethrowsCheckedToUncheckedException() {
        UncheckedText(
            object : Text {
                @Throws(IOException::class)
                override fun asString(): String {
                    throw IOException("intended")
                }

                override fun compareTo(other: Text): Int {
                    throw UnsupportedOperationException(
                        "#compareTo() not supported"
                    )
                }
            }
        ).asString()
    }

    @Test
    fun comparesToOtherUncheckedText() {
        val txt = "foobar"
        MatcherAssert.assertThat(
            "These UncheckedText are not equal",
            UncheckedText(
                TextOf(txt)
            ).compareTo(TextOf(txt)),
            Matchers.equalTo(0)
        )
    }
}
