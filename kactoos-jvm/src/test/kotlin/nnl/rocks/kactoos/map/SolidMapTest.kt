package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.Scalar
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.scalar.ScalarOf
import org.hamcrest.MatcherAssert
import org.hamcrest.Matchers
import org.junit.Test

/**
 * Test case for [SolidMap].
 *
 *
 *
 * @since 0.24
 *
 *
 */
class SolidMapTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat(
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
        MatcherAssert.assertThat<FuncOf<SolidMap<Int, Int, Any>, Boolean>>(
            "Can't behave as a map in multiple threads",
            FuncOf { map ->
                MatcherAssert.assertThat<SolidMap<Int, Int, Any>>(map, BehavesAsMap(0, 1))
                true
            },
            RunsInThreads(
                SolidMap(
                    MapEntry(0, - 1),
                    MapEntry(1, 1)
                )
            )
        )
    }

    @Test
    @Throws(Exception::class)
    fun mapsToSameObjects() {
        val map = SolidMap(
            FuncOf<Int, Map.Entry<Int, Scalar<Int>>> { input: Int -> MapEntry(input, ScalarOf { input }) },
            1, - 1, 0, 1
        )
        MatcherAssert.assertThat(
            "Can't map only once",
            map.get(0), Matchers.equalTo<Scalar<Int>>(map.get(0))
        )
    }
}
