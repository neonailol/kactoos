package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.text.TextOf
import nnl.rocks.kactoos.text.UpperText
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.io.IOException

/**
 * Test case for [Mapped].
 *
 *
 * @since 0.14
 *
 */
class MappedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            Mapped(
                FuncOf { i -> i + 1 },
                IterableOf(- 1, 1, 1)
            ),
            BehavesAsList(0)
        )
    }

    @Test
    @Throws(IOException::class)
    fun transformsList() {
        MatcherAssert.assertThat(
            "Can't transform an iterable",
            Mapped<String, Text>(
                FuncOf { input -> UpperText(TextOf(input)) },
                IterableOf("hello", "world", "друг")
            ).iterator().next().asString(),
            Matchers.equalTo("HELLO")
        )
    }

    @Test
    fun transformsEmptyList() {
        MatcherAssert.assertThat(
            "Can't transform an empty iterable",
            Mapped<String, Text>(
                FuncOf { input -> UpperText(TextOf(input)) },
                emptyList()
            ),
            Matchers.emptyIterable()
        )
    }
}
