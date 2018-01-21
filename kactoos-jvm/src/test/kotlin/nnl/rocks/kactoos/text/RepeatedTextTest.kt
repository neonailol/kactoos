package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [RepeatedText].
 *
 *
 * @since 0.9
 *
 */
class RepeatedTextTest {

    @Test
    fun repeatsWordsText() {
        MatcherAssert.assertThat(
            "Can't repeats a text",
            RepeatedText("hello", 2),
            TextHasString("hellohello")
        )
    }

    @Test
    fun repeatsCharText() {
        MatcherAssert.assertThat(
            "Can't repeats a char",
            RepeatedText("A", 5),
            TextHasString("AAAAA")
        )
    }
}
