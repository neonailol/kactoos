package nnl.rocks.kactoos.iterable

import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class IterableEnvelopeTest {

    @Test
    fun envelopeFromIterable() {
        BehavesAsIterable(
            IterableEnvelope(IterableOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun envelopeFromScalar() {
        BehavesAsIterable(
            IterableEnvelope(Constant { IterableOf(1, 2, 3) }),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun envelopeFromKScalar() {
        BehavesAsIterable(
            IterableEnvelope { IterableOf(1, 2, 3) },
            arrayOf(1, 2, 3)
        )
    }
}
