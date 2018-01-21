package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.iterable.Endless
import nnl.rocks.kactoos.iterable.Limited
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException
import java.nio.charset.StandardCharsets

/**
 * Test case for [InputAsBytes].
 *
 *
 *
 * @since 0.1
 *
 *
 */
class InputAsBytesTest {

    @Test
    @Throws(IOException::class)
    fun readsLargeInMemoryContent() {
        val multiplier = 5000
        val body = "1234567890"
        MatcherAssert.assertThat(
            "Can't read large content from in-memory Input",
            InputAsBytes(
                InputOf(
                    Limited(
                        multiplier, Endless(body)
                    ).joinToString(
                        ""
                    )
                )
            ).asBytes().size,
            Matchers.equalTo(body.length * multiplier)
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsLargeContent() {
        val size = 100000
        SlowInputStream(size).use { slow ->
            MatcherAssert.assertThat(
                "Can't read large content from Input",
                InputAsBytes(
                    InputOf(slow)
                ).asBytes().size,
                Matchers.equalTo(size)
            )
        }
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoBytes() {
        MatcherAssert.assertThat(
            "Can't read bytes from Input",
            String(
                InputAsBytes(
                    InputOf(
                        BytesOf(
                            TextOf("Hello, друг!")
                        )
                    )
                ).asBytes(),
                StandardCharsets.UTF_8
            ),
            Matchers.allOf(
                Matchers.startsWith("Hello, "),
                Matchers.endsWith("друг!")
            )
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsInputIntoBytesWithSmallBuffer() {
        MatcherAssert.assertThat(
            "Can't read bytes from Input with a small reading buffer",
            String(
                InputAsBytes(
                    InputOf(
                        BytesOf(
                            TextOf("Hello, товарищ!")
                        )
                    ),
                    2
                ).asBytes(),
                StandardCharsets.UTF_8
            ),
            Matchers.allOf(
                Matchers.startsWith("Hello,"),
                Matchers.endsWith("товарищ!")
            )
        )
    }
}
