package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.io.BytesOf
import nnl.rocks.kactoos.test.TextHasString
import org.hamcrest.MatcherAssert
import org.junit.Test
import java.io.IOException

/**
 * Test case for [HexOf].
 *
 *
 * @since 0.28
 *
 */
class HexOfTest {

    @Test
    fun empytString() {
        MatcherAssert.assertThat(
            "Can't represent an empty string as hexadecimal",
            HexOf(
                BytesOf("")
            ),
            TextHasString("")
        )
    }

    @Test
    @Throws(IOException::class)
    fun notEmpytString() {
        MatcherAssert.assertThat(
            "Can't represent a string as hexadecimal",
            HexOf(
                BytesOf("What's up, друг?")
            ),
            TextHasString("5768617427732075702c20d0b4d180d183d0b33f")
        )
    }
}
