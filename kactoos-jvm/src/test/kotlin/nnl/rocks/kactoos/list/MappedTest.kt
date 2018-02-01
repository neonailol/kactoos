
package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.text.TextOf
import nnl.rocks.kactoos.text.UpperText
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.io.IOException

/**
 * Test case for [Mapped].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: fd6bfe58c0de84e2445500359109b61065c06641 $
 * @since 0.14
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class MappedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat<Mapped<Int, Int>>(
                "Can't behave as a list",
                Mapped<Int, Int>(
                        { i -> i !! + 1 },
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
                        { input -> UpperText(TextOf(input)) },
                        IterableOf("hello", "world", "друг")
                ).iterator().next().asString(),
                Matchers.equalTo("HELLO")
        )
    }

    @Test
    fun transformsEmptyList() {
        MatcherAssert.assertThat<Mapped<String, Text>>(
                "Can't transform an empty iterable",
                Mapped<String, Text>(
                        { input -> UpperText(TextOf(input)) },
                        emptyList<String>()
                ),
                Matchers.emptyIterable()
        )
    }
}
