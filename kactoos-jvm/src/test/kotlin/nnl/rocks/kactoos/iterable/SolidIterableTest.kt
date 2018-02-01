
package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [SolidIterable].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: c2e0a33c850b5d7240982c0d79659fb91a578d61 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
 */
class SolidIterableTest {

    @Test
    fun makesListFromMappedIterable() {
        val list = SolidIterable<Int>(
                nnl.rocks.kactoos.list.Mapped<Int, Int>(
                    { i -> i + 1 },
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
    fun mapsToSameObjects() {
        val list = SolidIterable<Scalar<Int>>(
                nnl.rocks.kactoos.list.Mapped<Int, Scalar<Int>>(
                        { i -> { i } as Scalar<Int> },
                        IterableOf(1, - 1, 0, 1)
                )
        )
        MatcherAssert.assertThat(
                "Can't map only once",
                list.iterator().next(), Matchers.equalTo(list.iterator().next())
        )
    }

    @Test
    fun worksInThreadsMultipleTimes() {
        for (count in 0..99) {
            this.worksInThreads()
        }
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
                "Can't behave as an iterable in multiple threads",
                FuncOf{ list ->
                    MatcherAssert.assertThat(
                            list.iterator().next(),
                            Matchers.equalTo(list.iterator().next())
                    )
                    true
                },
                RunsInThreads(SolidIterable(1, 0, - 1, - 1, 2))
        )
    }
}
