package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.ScalarHasValue
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [IsBlank].
 *
 *
 * @since 0.1
 *
 */
class IsBlankTest {

    @Test
    fun determinesEmptyText() {
        MatcherAssert.assertThat(
            "Can't determine an empty text",
            IsBlank(
                TextOf("")
            ),
            ScalarHasValue(true)
        )
    }

    @Test
    fun determinesBlankText() {
        MatcherAssert.assertThat(
            "Can't determine an empty text with spaces",
            IsBlank(
                TextOf("  ")
            ),
            ScalarHasValue(true)
        )
    }

    @Test
    fun determinesNotBlankText() {
        MatcherAssert.assertThat(
            "Can't detect a nonempty text",
            IsBlank(
                TextOf("not empty")
            ),
            ScalarHasValue(false)
        )
    }
}
