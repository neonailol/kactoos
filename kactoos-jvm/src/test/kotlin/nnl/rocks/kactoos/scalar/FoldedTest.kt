
package nnl.rocks.kactoos.scalar

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.NoSuchElementException

/**
 * Test case for [Folded].
 *
 * @author Eduard Balovnev (bedward70@mail.ru)
 * @version $Id: 0796e8efc08c5e45af5821ad0c79ff4213fe0ac7 $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
class FoldedTest {

    @Test(expected = NoSuchElementException::class)
    @Throws(Exception::class)
    fun failsForEmptyIterable() {
        Folded(
                { first, last -> first },
                emptyList()
        )
                .value()
    }

    @Test
    @Throws(Exception::class)
    fun singleAtSingleIterable() {
        val single = 10
        MatcherAssert.assertThat(
                "Can't find the single",
                Folded<Int>(
                        { first, last -> first },
                        IterableOf<Scalar<Int>>({ single })
                ).value(),
                Matchers.equalTo(single)
        )
    }

    @Test
    @Throws(Exception::class)
    fun firstAtIterable() {
        val one = "Apple"
        val two = "Banana"
        val three = "Orange"
        MatcherAssert.assertThat(
                "Can't find the first",
                Folded(
                        { first, last -> first },
                        IterableOf<Scalar<String>>(
                                { one },
                                { two },
                                { three }
                        )
                ).value(),
                Matchers.equalTo(one)
        )
    }

    @Test
    @Throws(Exception::class)
    fun lastAtIterable() {
        val one = 'A'
        val two = 'B'
        val three = 'O'
        MatcherAssert.assertThat(
                "Can't find the last",
                Folded(
                        { first, last -> last },
                        IterableOf<Scalar<Char>>(
                                { one },
                                { two },
                                { three }
                        )
                ).value(),
                Matchers.equalTo(three)
        )
    }
}
