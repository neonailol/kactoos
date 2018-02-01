
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [SwappedCaseText].
 *
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 9e2af3e35203b9b595060cc47b0cd9860daf891b $
 * @since 0.13.3
 * @checkstyle JavadocMethodCheck (500 lines)
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
