
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Joined].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 5dcc9c2fc4f9088cce4444d75bea97b8006d3f87 $
 * @since 0.1
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
class JoinedTest {

    @Test
    fun transformsList() {
        MatcherAssert.assertThat(
                "Can't concatenate iterables together",
                LengthOf(
                        Joined(
                                IterableOf("hello", "world", "друг"),
                                IterableOf("how", "are", "you"),
                                IterableOf("what's", "up")
                        )
                ).toInt(),
                Matchers.equalTo(8)
        )
    }

    @Test
    fun joinsIterables() {
        MatcherAssert.assertThat(
                "Can't concatenate mapped iterables together",
                Joined(
                        Mapped(
                            FuncOf<String, Iterable<String>> { IterableOf(it) } as Func<String, Iterable<String>>,
                            IterableOf("x")
                        )
                ),
                Matchers.iterableWithSize(1)
        )
    }

    @Test
    fun joinsIterablesWithSize() {
        // @checkstyle DiamondOperatorCheck (1 line)
        val list = Joined(
                IterableOf(1, 2, - 1, 0, 1),
                IterableOf(),
                IterableOf(1, - 1, 0, 0),
                IterableOf(1)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
                "Can't concatenate four iterables together",
                list, Matchers.iterableWithSize(10)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
                "Can't concatenate four iterables together, again",
                list, Matchers.iterableWithSize(10)
        )
    }
}
