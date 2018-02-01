package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.matchers.RunsInThreads
import nnl.rocks.kactoos.scalar.ScalarOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [SolidMap].
 *
 * @author Yegor Bugayenko (yegor256@gmail.com)
 * @version $Id: bee77d8833535b697047540d5b90f0d3424c6cb5 $
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle ClassDataAbstractionCouplingCheck (500 lines)
 */
class SolidMapTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat<SolidMap<Int, Int, Any>>(
            "Can't behave as a map",
            SolidMap<Int, Int, Any>(
                MapEntry(0, - 1),
                MapEntry(1, 1)
            ),
            BehavesAsMap(0, 1)
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat(
            "Can't behave as a map in multiple threads",
            FuncOf { map ->
                MatcherAssert.assertThat(map, BehavesAsMap(0, 1))
                true
            },
            RunsInThreads(
                SolidMap<Int, Int, Any>(
                    MapEntry(0, - 1),
                    MapEntry(1, 1)
                )
            )
        )
    }

    @Test
    @Throws(Exception::class)
    fun mapsToSameObjects() {
        val map = SolidMap<Int, Scalar<Int>, Int>(
            FuncOf { input -> MapEntry<Int, Scalar<Int>>(input, ScalarOf { input }) },
            1, - 1, 0, 1
        )
        MatcherAssert.assertThat(
            "Can't map only once",
            map.get(0), Matchers.equalTo<Scalar<Int>>(map.get(0))
        )
    }
}
