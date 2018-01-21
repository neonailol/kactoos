package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.IterableOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [SolidList].
 *
 *
 *
 * @since 0.24
 *
 *
 */
class SolidListTest {

    @Test
    @Throws(Exception::class)
    fun behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            SolidList(1, 0, - 1, - 1, 2),
            BehavesAsList(0)
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
            FuncOf { list -> ! list.iterator().hasNext() },
            RunsInThreads(SolidList<Any>(emptyList()))
        )
        MatcherAssert.assertThat<FuncOf<SolidList<Int>, Boolean>>(
            FuncOf { list ->
                MatcherAssert.assertThat<SolidList<Int>>(list, BehavesAsList(0))
                true
            },
            RunsInThreads(SolidList(1, 0, - 1, - 1, 2))
        )
    }

    @Test
    @Throws(Exception::class)
    fun makesListFromMappedIterable() {
        val list = SolidList(
            Mapped(
                FuncOf<Int, Int> { i -> i + 1 },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat<List<Int>>(
            "Can't turn a mapped iterable into a list",
            list, Matchers.iterableWithSize(4)
        )
        MatcherAssert.assertThat<List<Int>>(
            "Can't turn a mapped iterable into a list, again",
            list, Matchers.iterableWithSize(4)
        )
    }

    @Test
    @Throws(Exception::class)
    fun mapsToSameObjects() {
        val list = SolidList(
            Mapped(
                FuncOf<Int, Int> { i -> i },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat(
            "Can't map only once",
            list[0], Matchers.equalTo(list[0])
        )
    }
}
