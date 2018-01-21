package nnl.rocks.kactoos.text

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [ComparableTextTest].
 *
 * @since 0.27
 */
class ComparableTextTest {

    @Test
    @Throws(Exception::class)
    fun comparesWithASubtext() {
        MatcherAssert.assertThat(
            "Can't compare sub texts",
            ComparableText(
                TextOf(
                    "here to there"
                )
            ).compareTo(
                ComparableText(
                    SubText("from here to there", 5)
                )
            ),
            Matchers.`is`(0)
        )
    }

    @Test
    fun comparesToUncheckedText() {
        val txt = "foobar"
        MatcherAssert.assertThat(
            "These UncheckedText are not equal",
            ComparableText(
                UncheckedText(
                    TextOf(txt)
                )
            ).compareTo(
                ComparableText(TextOf(txt))
            ),
            Matchers.equalTo(0)
        )
    }
}
