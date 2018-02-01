package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [nnl.rocks.kactoos.collection.Reversed].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: 93997d1f19dd73cf30513e685e8709aa97c58898 $
 * @since 0.16
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
class ReversedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            CollectionNoNulls(
                Reversed(
                    IterableOf(0, - 1, 2)
                )
            ),
            BehavesAsCollection(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun reverseList() {
        val last = "last"
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    "item", last
                )
            ).iterator().next(),
            Matchers.equalTo(last)
        )
    }

    @Test
    @Throws(Exception::class)
    fun reverseEmptyList() {
        MatcherAssert.assertThat(
            Reversed(
                emptyList()
            ),
            Matchers.emptyIterable<Any>()
        )
    }

    @Test
    @Throws(Exception::class)
    fun size() {
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    "0", "1", "2"
                )
            ).size,
            Matchers.equalTo(3)
        )
    }

    @Test
    @Throws(Exception::class)
    fun isEmpty() {
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    6, 16
                )
            ).isEmpty(),
            Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun contains() {
        val word = "objects"
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    "hello", "elegant", word
                )
            ).contains(word),
            Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    fun toArray() {
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    1, 2, 3, 4
                )
            ).toTypedArray(),
            Matchers.arrayContaining(4, 3, 2, 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun toArrayWithArray() {
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    1, 2, 3, 4, 5
                )
            ).toTypedArray(),
            Matchers.arrayContaining(5, 4, 3, 2, 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun containsAll() {
        val first = "first"
        val second = "second"
        MatcherAssert.assertThat(
            Reversed(
                IterableOf(
                    first, second, "third"
                )
            ).containsAll(ListOf(first, second)),
            Matchers.equalTo(true)
        )
    }
}
