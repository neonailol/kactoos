
package nnl.rocks.kactoos.collection

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test Case for [SolidCollection].
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: 1d949a1ec5e7ea59b797377b16836031e2dcbfdf $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 lines)
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
        val list = SolidCollection<Int>(
                nnl.rocks.kactoos.list.Mapped<Int, Int>(
                        { i -> i !! + 1 },
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
        val list = SolidCollection<Scalar<Int>>(
                nnl.rocks.kactoos.list.Mapped<Int, Scalar<Int>>(
                        { i -> { i } as Scalar<Int> },
                        IterableOf(1, - 1, 0, 1)
                )
        )
        MatcherAssert.assertThat(
                "Can't map only once",
                list.iterator().next(), Matchers.equalTo<Scalar<Int>>(list.iterator().next())
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
                "Can't behave as a collection in multiple threads",
                { list ->
                    MatcherAssert.assertThat<T>(list, BehavesAsCollection(0))
                    true
                },
                RunsInThreads(SolidCollection<T>(1, 0, - 1, - 1, 2))
        )
    }
}
