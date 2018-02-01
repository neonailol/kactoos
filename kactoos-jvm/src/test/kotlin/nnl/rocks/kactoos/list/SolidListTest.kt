
package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [SolidList].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @author Mehmet Yildirim (memoyil@gmail.com)
 * @version $Id: 7d58ecd54b74418e1ef2c8fc372dd34aab757072 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
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
                { list -> ! list.iterator().hasNext() },
                RunsInThreads(SolidList<X>(emptyList<Any>()))
        )
        MatcherAssert.assertThat(
                { list ->
                    MatcherAssert.assertThat<T>(list, BehavesAsList(0))
                    true
                },
                RunsInThreads(SolidList<X>(1, 0, - 1, - 1, 2))
        )
    }

    @Test
    @Throws(Exception::class)
    fun makesListFromMappedIterable() {
        val list = SolidList<Int>(
                Mapped<Int, Int>(
                        { i -> i !! + 1 },
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
        val list = SolidList<Scalar<Int>>(
                Mapped<Int, Scalar<Int>>(
                        { i -> { i } as Scalar<Int> },
                        IterableOf(1, - 1, 0, 1)
                )
        )
        MatcherAssert.assertThat(
                "Can't map only once",
                list.get(0), Matchers.equalTo<Scalar<Int>>(list.get(0))
        )
    }
}
