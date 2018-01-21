package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [SolidCollection].
 *
 *
 * @since 0.24
 *
 *
 */
class SolidCollectionTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a collection",
            SolidCollection(1, 2, 0, - 1),
            BehavesAsCollection(- 1)
        )
    }

    @Test
    @Throws(Exception::class)
    fun makesListFromMappedIterable() {
        val list = SolidCollection(
            nnl.rocks.kactoos.list.Mapped(
                FuncOf<Int, Int> { i -> i + 1 },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat<Collection<Int>>(
            "Can't turn a mapped iterable into a list",
            list, Matchers.iterableWithSize(4)
        )
        MatcherAssert.assertThat<Collection<Int>>(
            "Can't turn a mapped iterable into a list, again",
            list, Matchers.iterableWithSize(4)
        )
    }

    @Test
    @Throws(Exception::class)
    fun mapsToSameObjects() {
        val list = SolidCollection(
            nnl.rocks.kactoos.list.Mapped(
                FuncOf<Int, Int> { i -> i },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat(
            "Can't map only once",
            list.iterator().next(), Matchers.equalTo(list.iterator().next())
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat<FuncOf<SolidCollection<Int>, Boolean>>(
            "Can't behave as a collection in multiple threads",
            FuncOf { list ->
                MatcherAssert.assertThat<SolidCollection<Int>>(list, BehavesAsCollection(0))
                true
            },
            RunsInThreads(SolidCollection(1, 0, - 1, - 1, 2))
        )
    }
}
