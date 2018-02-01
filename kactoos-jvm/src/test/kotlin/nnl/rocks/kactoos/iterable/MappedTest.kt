package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.text.TextOf
import nnl.rocks.kactoos.text.UpperText
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [Mapped].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 287bbbe19b8a92e880ab1ac8350e2fa2d2e663b2 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class MappedTest {

    @Test
    @Throws(IOException::class)
    fun transformsList() {
        MatcherAssert.assertThat(
            "Can't transform an iterable",
            Mapped<String, Text>(
                FuncOf { input -> UpperText(TextOf(input)) },
                IterableOf(
                    "hello", "world", "друг"
                )
            ).iterator().next().asString(),
            Matchers.equalTo("HELLO")
        )
    }

    @Test
    fun transformsEmptyList() {
        MatcherAssert.assertThat<Mapped<String, Text>>(
            "Can't transform an empty iterable",
            Mapped<String, Text>(
                FuncOf { input -> UpperText(TextOf(input)) },
                emptyList<String>()
            ),
            Matchers.emptyIterable()
        )
    }
}
