package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.test.BehavesAsMap
import kotlin.test.Test

class MapOfTest {

    @Test
    fun mapOfIterableMapEntry() {
        BehavesAsMap(
            MapOf(
                IterableOf(
                    MapEntry(1, 1),
                    MapEntry(2, 2),
                    MapEntry(3, 3)
                )
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfVarargMapEntry() {
        BehavesAsMap(
            MapOf(
                MapEntry(1, 1),
                MapEntry(2, 2),
                MapEntry(3, 3)
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfMapAndVarargMapEntry() {
        BehavesAsMap(
            MapOf(
                MapOf(MapEntry(1, 1)),
                MapEntry(2, 2),
                MapEntry(3, 3)
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfMapAndIterableMapEntry() {
        BehavesAsMap(
            MapOf(
                MapOf(MapEntry(1, 1)),
                IterableOf(
                    MapEntry(2, 2),
                    MapEntry(3, 3)
                )
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfIterableUsingKFuncKFunc() {
        BehavesAsMap(
            MapOf(
                { key -> key },
                { value -> value },
                IterableOf(1, 2, 3)
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfMapAndIterableUsingKFuncKFunc() {
        BehavesAsMap(
            MapOf(
                { key -> key },
                { value -> value },
                MapOf(MapEntry(1, 1)),
                IterableOf(2, 3)
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfIterableUsingMapEntryKFunc() {
        BehavesAsMap(
            MapOf(
                { entry -> MapEntry(entry, entry) },
                IterableOf(1, 2, 3)
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapOfMapAndIterableUsingMapEntryKFunc() {
        BehavesAsMap(
            MapOf(
                { entry -> MapEntry(entry, entry) },
                MapOf(MapEntry(1, 1)),
                IterableOf(2, 3)
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }
}
