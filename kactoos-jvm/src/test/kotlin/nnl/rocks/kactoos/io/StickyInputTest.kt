package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.RepeatedFunc
import nnl.rocks.kactoos.test.MatcherOf
import nnl.rocks.kactoos.test.TextHasString
import nnl.rocks.kactoos.text.TextOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL

/**
 * Test case for [StickyInput].
 *
 *
 * @since 0.6
 *
 *
 */
class StickyInputTest {

    @Test
    fun readsFileContent() {
        MatcherAssert.assertThat(
            "Can't read bytes from a file",
            StickyInput(
                ResourceOf(
                    "nnl/rocks/kactoos/large-text.txt"
                )
            ),
            MatcherOf(
                RepeatedFunc<Input, Boolean>(
                    FuncOf { input ->
                        BytesOf(
                            TeeInput(input, DeadOutput())
                        ).asBytes().size == 74536
                    },
                    10
                )
            )
        )
    }

    @Test
    @Throws(MalformedURLException::class)
    fun readsRealUrl() {
        MatcherAssert.assertThat(
            "Can't fetch text page from the URL",
            TextOf(
                StickyInput(
                    InputOf(
                        URL(
                            "file:src/test/resources/nnl/rocks/kactoos/large-text.txt"
                        )
                    )
                )
            ),
            TextHasString(
                Matchers.endsWith("est laborum.\n")
            )
        )
    }

    @Test
    fun readsFileContentSlowlyAndCountsLength() {
        val size = 100_000L
        MatcherAssert.assertThat(
            "Can't read bytes from a large source slowly and count length",
            LengthOf(
                StickyInput(
                    SlowInput(size)
                )
            ).toLong(),
            Matchers.equalTo(size)
        )
    }

    @Test
    @Throws(IOException::class)
    fun readsFileContentSlowly() {
        val size = 130000
        MatcherAssert.assertThat(
            "Can't read bytes from a large source slowly",
            BytesOf(
                StickyInput(
                    SlowInput(size)
                )
            ).asBytes().size,
            Matchers.equalTo(size)
        )
    }
}
