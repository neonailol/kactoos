package nnl.rocks.kactoos.map

import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.test.BehavesAsMap
import kotlin.test.Test

class MapEnvelopeTest {

    @Test
    fun mapEnvelopeFromMap() {
        BehavesAsMap(
            MapEnvelope(
                mapOf(
                    1 to 1,
                    2 to 2,
                    3 to 3
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
    fun mapEnvelopeFromScalarMap() {
        BehavesAsMap(
            MapEnvelope(
                Constant {
                    mapOf(
                        1 to 1,
                        2 to 2,
                        3 to 3
                    )
                }
            ),
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }

    @Test
    fun mapEnvelopeFromKScalarMap() {
        BehavesAsMap(
            MapEnvelope {
                mapOf(
                    1 to 1,
                    2 to 2,
                    3 to 3
                )
            },
            mapOf(
                1 to 1,
                2 to 2,
                3 to 3
            )
        )
    }
}
