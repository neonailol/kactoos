package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.test.InputHasContent
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [DeadOutput].
 *
 *
 *
 * @since 0.16
 *
 *
 */
class DeadOutputTest {

    @Test
    fun readsEmptyContent() {
        MatcherAssert.assertThat(
            "Can't write empty content",
            TeeInput(
                InputOf("How are you, мой друг?"),
                DeadOutput()
            ),
            InputHasContent(Matchers.endsWith("друг?"))
        )
    }
}
