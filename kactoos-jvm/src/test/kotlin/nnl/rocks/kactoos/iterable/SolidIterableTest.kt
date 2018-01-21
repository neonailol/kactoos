package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [SolidIterable].
 *
 *
 * @since 0.24
 *
 *
 */
class SolidIterableTest {

    @Test
    @Throws(Exception::class)
    fun makesListFromMappedIterable() {
        val list = SolidIterable(
            nnl.rocks.kactoos.list.Mapped(
                FuncOf<Int, Int> { i -> i + 1 },
                IterableOf(1, - 1, 0, 1)
            )
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't turn a mapped iterable into a list",
            list, Matchers.iterableWithSize(4)
        )
        MatcherAssert.assertThat<Iterable<Int>>(
            "Can't turn a mapped iterable into a list, again",
            list, Matchers.iterableWithSize(4)
        )
    }

    @Test
    @Throws(Exception::class)
    fun mapsToSameObjects() {
        val list = SolidIterable(
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
        MatcherAssert.assertThat<FuncOf<SolidIterable<Int>, Boolean>>(
            "Can't behave as an iterable in multiple threads",
            FuncOf { list ->
                MatcherAssert.assertThat(
                    list.iterator().next(),
                    Matchers.equalTo<Int>(list.iterator().next())
                )
                true
            },
            RunsInThreads(SolidIterable(1, 0, - 1, - 1, 2))
        )
    }
}
