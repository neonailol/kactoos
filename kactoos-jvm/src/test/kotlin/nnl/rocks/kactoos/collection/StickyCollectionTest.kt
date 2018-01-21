package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.list.ListOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test
import java.util.Arrays
import java.util.Collections
import java.util.concurrent.atomic.AtomicInteger

/**
 * Test case for [StickyCollection].
 *
 *
 * @since 0.16
 *
 */
class StickyCollectionTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            StickyCollection(ListOf(1, 2, 0, - 1)),
            BehavesAsCollection(0)
        )
    }

    @Test
    @Throws(Exception::class)
    fun ignoresChangesInIterable() {
        val size = AtomicInteger(2)
        val list = StickyCollection(
            ListOf<Int>(
                Collections.nCopies(size.incrementAndGet(), 0).iterator()
            )
        )
        MatcherAssert.assertThat(
            "Can't ignore the changes in the underlying iterable",
            list.size,
            Matchers.equalTo<Int>(list.size)
        )
    }

    @Test
    @Throws(Exception::class)
    fun decoratesArray() {
        MatcherAssert.assertThat(
            "Can't decorate an array of numbers",
            StickyCollection(- 1, 0).size,
            Matchers.equalTo(2)
        )
    }

    @Test
    fun testEmpty() {
        MatcherAssert.assertThat(
            StickyCollection<Any>().isEmpty(),
            Matchers.equalTo(true)
        )
    }

    @Test
    fun testContains() {
        MatcherAssert.assertThat(
            StickyCollection(1, 2).contains(1),
            Matchers.equalTo(true)
        )
    }

    @Test
    fun testToArray() {
        MatcherAssert.assertThat(
            StickyCollection(1, 2).toTypedArray(),
            Matchers.arrayContaining<Any>(1, 2)
        )
    }

    @Test
    fun testToArrayIntoArray() {
        MatcherAssert.assertThat(
            StickyCollection(1, 2).toTypedArray(),
            Matchers.arrayContaining(1, 2)
        )
    }

    @Test
    fun testContainsAll() {
        MatcherAssert.assertThat(
            StickyCollection(1, 2).containsAll(Arrays.asList(1, 2)),
            Matchers.equalTo(true)
        )
    }
}
