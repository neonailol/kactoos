
package nnl.rocks.kactoos.list

import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [nnl.rocks.kactoos.collection.Joined].
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: eef0d66faee6f1fd8dfedc6ae0badb3bb4e5dcd2 $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
class JoinedTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
                "Can't behave as a list",
                Joined(
                        ListOf(1, 2),
                        ListOf(3, 4)
                ),
                BehavesAsList(2)
        )
    }

    @Test
    @Throws(Exception::class)
    fun size() {
        MatcherAssert.assertThat(
                Joined(
                        ListOf(1, 2),
                        ListOf(3, 4)
                ).size,
                Matchers.equalTo(4)
        )
    }

    @Test
    @Throws(Exception::class)
    fun isEmpty() {
        MatcherAssert.assertThat(
                Joined(
                        ListOf(5, 6)
                ).isEmpty(),
                Matchers.equalTo(false)
        )
    }

    @Test
    @Throws(Exception::class)
    fun contains() {
        val element = 0
        MatcherAssert.assertThat(
                Joined(
                        ListOf(7, 8),
                        ListOf(9, element)
                ).contains(element),
                Matchers.equalTo(true)
        )
    }

    @Test
    @Throws(Exception::class)
    operator fun iterator() {
        val element = "element"
        MatcherAssert.assertThat(
                Joined(
                        ListOf(element, "first"),
                        ListOf("second", "third")
                ).iterator().next(),
                Matchers.equalTo(element)
        )
    }

    @Test
    @Throws(Exception::class)
    fun toArray() {
        MatcherAssert.assertThat<Array<Any>>(
                Joined(
                        ListOf(11, 12),
                        ListOf(13, 14)
                ).toTypedArray(),
                Matchers.equalTo<Array<Any>>(ListOf(11, 12, 13, 14).toTypedArray())
        )
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun add() {
        Joined(ListOf("add0")).add("new add0")
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun remove() {
        Joined(ListOf("remove")).remove("new remove")
    }

    @Test
    @Throws(Exception::class)
    fun containsAll() {
        val first = "item1"
        val second = "item2"
        MatcherAssert.assertThat(
                Joined(
                        ListOf(first, "item3"),
                        ListOf(second, "item4")
                ).containsAll(ListOf(first, second)),
                Matchers.equalTo(true)
        )
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun addAll() {
        Joined(
                ListOf("addAll")
        ).addAll(ListOf("new addAll"))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun addAllSecond() {
        Joined(
                ListOf("addAll1")
        ).addAll(22, ListOf("new addAll1"))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun removeAll() {
        Joined(
                ListOf("removeAll")
        ).removeAll(ListOf("new removeAll"))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun retainAll() {
        Joined<String>().retainAll(ListOf("retain", "All"))
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun clear() {
        Joined(ListOf("clear")).clear()
    }

    @Test
    @Throws(Exception::class)
    fun get() {
        val element = "element2"
        MatcherAssert.assertThat(
                Joined(
                        ListOf("element1"),
                        ListOf(element, "element3")
                )[1],
                Matchers.equalTo(element)
        )
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun set() {
        Joined(ListOf("set")).set(33, "new set")
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun addSecond() {
        Joined(ListOf("add")).add(44, "new add")
    }

    @Test(expected = UnsupportedOperationException::class)
    @Throws(Exception::class)
    fun removeSecond() {
        Joined<String>().removeAt(55)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    @Throws(Exception::class)
    fun listIteratorSecond() {
        Joined<Int>().listIterator(66)
    }

    @Test
    @Throws(Exception::class)
    fun subList() {
        val element = "elem2"
        MatcherAssert.assertThat(
                Joined(
                        ListOf("elem1", element),
                        ListOf("elem3", "elem4")
                ).subList(1, 3).iterator().next(),
                Matchers.equalTo(element)
        )
    }
}
