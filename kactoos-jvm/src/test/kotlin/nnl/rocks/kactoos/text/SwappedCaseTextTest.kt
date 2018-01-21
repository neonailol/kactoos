package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [SwappedCaseText].
 *
 *
 *
 * @since 0.13.3
 *
 */
class SwappedCaseTextTest {

    @Test
    fun swapText() {
        MatcherAssert.assertThat(
            "Can't swap a text",
            SwappedCaseText(
                TextOf("HellO!")
            ),
            TextHasString("hELLo!")
        )
    }

    @Test
    fun swapEmptyText() {
        MatcherAssert.assertThat(
            "Empty swapped text should be the same as original",
            SwappedCaseText(
                TextOf("")
            ),
            TextHasString("")
        )
    }
}
