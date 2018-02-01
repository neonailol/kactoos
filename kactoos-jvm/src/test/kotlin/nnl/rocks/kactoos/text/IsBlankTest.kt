
package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.matchers.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [IsBlank].
 * @author Andriy Kryvtsun (kontiky@gmail.com)
 * @version $Id: d3aeb1fb4be5c65adb208eabf97b94c59d3fcdd2 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class IsBlankTest {

    @Test
    fun determinesEmptyText() {
        MatcherAssert.assertThat(
                "Can't determine an empty text",
                IsBlank(
                        TextOf("")
                ),
                ScalarHasValue(java.lang.Boolean.TRUE)
        )
    }

    @Test
    fun determinesBlankText() {
        MatcherAssert.assertThat(
                "Can't determine an empty text with spaces",
                IsBlank(
                        TextOf("  ")
                ),
                ScalarHasValue(java.lang.Boolean.TRUE)
        )
    }

    @Test
    fun determinesNotBlankText() {
        MatcherAssert.assertThat(
                "Can't detect a nonempty text",
                IsBlank(
                        TextOf("not empty")
                ),
                ScalarHasValue(java.lang.Boolean.FALSE)
        )
    }
}
