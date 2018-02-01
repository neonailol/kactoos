
package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [Limited].
 *
 * @author Mykola Yashchenko (vkont4@gmail.com)
 * @version $Id: 70cc021b5551d023aaefd0a55b381541bb5b15ad $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
class JoinedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a collection",
                Joined(
                        IterableOf(1, - 1, 2, 0),
                        IterableOf(1, - 1, 2, 0),
                        IterableOf(1, - 1, 2, 0)
                ),
                BehavesAsCollection(- 1)
        )
    }

    @Test
    fun size() {
        MatcherAssert.assertThat(
                Joined(
                        IterableOf("hello", "world", "друг"),
                        IterableOf("how", "are", "you"),
                        IterableOf("what's", "up")
                ).size,
                Matchers.equalTo(8)
        )
    }

    @Test
    fun sizeEmptyReturnZero() {
        MatcherAssert.assertThat(
                Joined(
                        emptyList<Iterable<String>>()
                ).size,
                Matchers.equalTo(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withItemsNotEmpty() {
        MatcherAssert.assertThat(
                Joined(
                        IterableOf("1", "2"),
                        IterableOf("3", "4")
                ).isEmpty(),
                Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun withoutItemsIsEmpty() {
        MatcherAssert.assertThat(
                Joined(
                        emptyList<Iterable<String>>()
                ).isEmpty(),
                Matchers.equalTo(true)
        )
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun testAdd() {
        Joined(
                IterableOf(1, 2),
                IterableOf(3, 4),
                IterableOf(5, 6)
        ).add(7)
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun testRemove() {
        Joined(
                IterableOf("w", "a"),
                IterableOf("b", "c")
        ).remove("t")
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun testAddAll() {
        Joined(
                IterableOf(111),
                IterableOf(222),
                IterableOf(333)
        ).addAll(ListOf(111, 222))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun testRemoveAll() {
        Joined(
                IterableOf(111, 222),
                IterableOf(444)
        ).removeAll(ListOf(222))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun testRetainAll() {
        Joined(
                IterableOf(22),
                IterableOf(11)
        ).retainAll(ListOf(66, 11))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun testClear() {
        Joined(
                IterableOf(10),
                IterableOf(20)
        ).clear()
    }
}
