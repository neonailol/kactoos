package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.InputHasContent
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [DeadInput].
 *
 *
 *
 * @since 0.16
 *
 *
 */
class DeadInputTest {

    @Test
    fun readsEmptyContent() {
        MatcherAssert.assertThat(
            "Can't read empty content",
            DeadInput(),
            InputHasContent("")
        )
    }
}
