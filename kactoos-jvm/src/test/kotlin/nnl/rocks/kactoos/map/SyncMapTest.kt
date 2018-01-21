package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.RunsInThreads
import nnl.rocks.kactoos.func.FuncOf
import org.hamcrest.MatcherAssert
import org.junit.Test

/**
 * Test case for [StickyMap].
 *
 *
 *
 * @since 0.24
 *
 *
 */
class SyncMapTest {

    @Test
    fun behavesAsMap() {
        MatcherAssert.assertThat(
            "Can't behave as a map",
            SyncMap<Int, Int, Any>(
                MapEntry(0, - 1),
                MapEntry(1, 1)
            ),
            BehavesAsMap(0, 1)
        )
    }

    @Test
    fun worksInThreads() {
        MatcherAssert.assertThat<FuncOf<SyncMap<Int, Int, Any>, Boolean>>(
            "Can't behave as a map in multiple threads",
            FuncOf { map ->
                MatcherAssert.assertThat<SyncMap<Int, Int, Any>>(map, BehavesAsMap(0, 1))
                true
            },
            RunsInThreads(
                SyncMap(
                    MapEntry(0, - 1),
                    MapEntry(1, 1)
                )
            )
        )
    }
}
