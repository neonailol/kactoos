
package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

import java.util.ArrayList

/**
 * Test case for [nnl.rocks.kactoos.collection.Limited].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: cf022565e86bbcb5c6ff083882de07b327dc40dc $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
class LimitedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a collection",
                Limited(
                        2,
                        IterableOf(1, - 1, 2, 0)
                ),
                BehavesAsCollection(- 1)
        )
    }

    @Test
    fun size() {
        MatcherAssert.assertThat(
                Limited(
                        2,
                        IterableOf(
                                "hello", "world", "друг"
                        )
                ).size,
                Matchers.equalTo(2)
        )
    }

    @Test
    fun sizeEmptyReturnZero() {
        MatcherAssert.assertThat(
                Limited(
                        2,
                        emptyList()
                ).size,
                Matchers.equalTo(0)
        )
    }

    @Test
    fun sizeLimitZeroReturnZero() {
        MatcherAssert.assertThat(
                Limited(
                        0, IterableOf("1", "2", "3")
                ).size,
                Matchers.equalTo(0)
        )
    }

    @Test
    fun withItemsNotEmpty() {
        MatcherAssert.assertThat(
                Limited(
                        2, IterableOf("first", "second")
                ).isEmpty(),
                Matchers.equalTo(false)
        )
    }

    @Test
    fun withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
                Limited(
                        0, IterableOf("third", "fourth")
                ).isEmpty(),
                Matchers.equalTo(true)
        )
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testAdd() {
        Limited(
                2, IterableOf(1, 2, 3, 4)
        ).add(6)
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testRemove() {
        Limited(
                2, IterableOf(1, 2, 3, 4)
        ).remove(1)
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testAddAll() {
        Limited(
                2, IterableOf(1, 2, 3, 4)
        ).addAll(ArrayList<Int>(6))
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testRemoveAll() {
        Limited(
                2, IterableOf(1, 2, 3, 4)
        ).removeAll(ArrayList<Int>(2))
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testRetainAll() {
        Limited(
                2, IterableOf(1, 2, 3, 4)
        ).retainAll(ArrayList<Any>(2))
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testClear() {
        Limited(
                2, IterableOf(1, 2, 3, 4)
        ).clear()
    }
}
