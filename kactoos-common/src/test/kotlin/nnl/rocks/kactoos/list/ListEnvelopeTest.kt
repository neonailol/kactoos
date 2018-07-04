package nnl.rocks.kactoos.list

import nnl.rocks.kactoos.scalar.Constant
import nnl.rocks.kactoos.test.BehavesAsList
import kotlin.test.Test

class ListEnvelopeTest {

    @Test
    fun formList() {
        BehavesAsList(
            ListEnvelope(ListOf(1, 2, 3)),
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun formKScalarList() {
        BehavesAsList(
            ListEnvelope { ListOf(1, 2, 3) },
            arrayOf(1, 2, 3)
        )
    }

    @Test
    fun formScalarList() {
        BehavesAsList(
            ListEnvelope(Constant { ListOf(1, 2, 3) }),
            arrayOf(1, 2, 3)
        )
    }
}
